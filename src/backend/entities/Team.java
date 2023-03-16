package backend.entities;

import backend.entities.helper.Attack;

import java.util.ArrayList;
import java.util.Comparator;

public class Team {
    public final ArrayList<Unit> originalUnits = new ArrayList<>();
    public final ArrayList<Unit> units = new ArrayList<>();
    private final ArrayList<Unit> flankingTargets = new ArrayList<>();
    private int totalHp = 0;
    public static boolean critsEnabled = false;
    public String name = "";

    public Team() {

    }

    public void recover() {
        units.clear();
        flankingTargets.clear();
        totalHp = 0;

        for (Unit unit : originalUnits) {
            unit.recover();
            units.add(unit);
            flankingTargets.add(unit);
            totalHp += unit.getSingleHealth();
        }

        flankingTargets.sort(Comparator.comparing(Unit::getFlankingPriority));
    }

    public void takeDamage(Attack attack) {
        if (totalHp == 0) return;

        int power = attack.getPower();
        int amount = attack.getAmount();

        boolean flanking = attack.isFlanking();
        Unit target = getTarget(flanking);

        while (target != null && amount > 0) {
            int frontHP = target.getRemainder();

            // First attack the combatant in the front if it's damaged
            if (frontHP < target.getTotalHealth()) {
                // Attack either until frontline combatant is dead, or amount runs out
                if (power * amount <= frontHP) { // not enough attack to get through first guy
                    damage(target, power * amount);
                    break;
                } else { // get through first guy
                    amount -= Math.floorDiv(frontHP, power);
                    damage(target, frontHP);
                }

                if (target.isDead()) {
                    target = removeUnitAndGetNext(target, flanking);
                    continue;
                }
            }

            // Then attack everybody else.
            // Either attack until back combatant is dead, or amount runs out
            int attacksPerKill = Math.floorDiv(target.getMaxHealth(), power);
            int targetPop = target.getCount();

            if (amount / attacksPerKill < targetPop) { // not enough attack to get through target
                damage(target, (amount / attacksPerKill * target.getMaxHealth()) + (amount % attacksPerKill) * power);
                if (target.isDead()) removeUnit(target);
                break;
            } else { // wiped unit
                amount -= attacksPerKill * targetPop;
                damage(target, target.getCurrentHealth());

                target = removeUnitAndGetNext(target, flanking);
            }
        }
    }

    private void damage(Unit target, int dmg) {
        target.damage(dmg);
        totalHp -= dmg;
    }

    private void removeUnit(Unit unit) {
        units.remove(unit);
        flankingTargets.remove(unit);
    }

    private Unit removeUnitAndGetNext(Unit unit, boolean flanking) {
        units.remove(unit);
        flankingTargets.remove(unit);

        if (units.size() == 0) return null;
        else if (flanking) return flankingTargets.get(0);
        else return units.get(0);
    }

    public Unit getTarget(boolean flanking) {
        if (flanking && flankingTargets.size() > 0)
            return flankingTargets.get(0);
        else if (units.size() > 0)
            return units.get(0);
        else
            return null;
    }

    public Unit getUnit(int i) {
        return units.get(i);
    }

    public int getSize() {
        return units.size();
    }

    public int getTotalHp() {
        return totalHp;
    }
}
