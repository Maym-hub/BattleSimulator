package backend;

import backend.entities.BattleData;
import backend.entities.Team;
import backend.entities.Unit;
import backend.entities.helper.Attack;

import java.util.ArrayList;

public class Calculator {
    public BattleData calculate(BattleData battleData) {
        Team paragons = battleData.getParagonTeam();
        Team orcs = battleData.getOrcTeam();

        //battleData.paragons.setUnitsCountTo("Milita", 100);
        battleData.paragons.units.get(0).setCount(100);
        System.out.println(battleData.paragons.units.get(0).getCount());

        fight(paragons, orcs);
        return battleData;
    }

    private static void fight(Team paragons, Team orcs) {
        System.out.println(paragons.getTotalHp());
        System.out.println(orcs.units);
        while (paragons.getTotalHp() > 0 && orcs.getTotalHp() > 0) {

            ArrayList<Attack> paragonAttacks = new ArrayList<>();
            for (int i = 0; i < paragons.getSize(); i++) {
                Unit unit = paragons.getUnit(i);
                if (!unit.isDead())
                    paragonAttacks.add(unit.getAttack());
            }

            ArrayList<Attack> orcAttacks = new ArrayList<>();
            for (int i = 0; i < orcs.getSize(); i++) {
                Unit unit = orcs.getUnit(i);
                if (!unit.isDead())
                    orcAttacks.add(unit.getAttack());
            }

            for (Attack attack : paragonAttacks)
                orcs.takeDamage(attack);

            for (Attack attack : orcAttacks)
                paragons.takeDamage(attack);
        }
    }
}
