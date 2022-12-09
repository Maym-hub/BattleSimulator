package backend.entities;

import backend.entities.helper.Attack;

import java.util.List;

import static java.lang.Math.round;

public class Unit {
    private final Integer maxHealth;
    private final Integer maxCount = 0;
    public Integer id;
    public String faction;
    public String name;
    public Integer singleHealth;
    public Integer attack;
    public float doubleDamageChance;
    public float damageOrder;
    public Special special;
    public Integer count = 0;
    public Integer expectedAttack = 0;
    public BattleData battleData = null;

    public Integer currentHealth;

    public Unit(List<String> unitData) {
        this.id = Integer.valueOf(unitData.get(0));
        this.faction = unitData.get(1);
        this.name = unitData.get(2);
        this.singleHealth = Integer.valueOf(unitData.get(3));
        this.maxHealth = Integer.valueOf(unitData.get(3));
        this.attack = Integer.valueOf(unitData.get(4));
        this.doubleDamageChance = Float.parseFloat(unitData.get(5));
        this.damageOrder = Float.parseFloat(unitData.get(6));
        if (unitData.size()>6){
            this.setSpecial(new Special(unitData.get(6)));
        }
        this.currentHealth = singleHealth * count;
    }

    public Integer getId() {
        return id;
    }

    public String getFaction() {
        return faction;
    }

    public Integer getSingleHealth() {
        return singleHealth;
    }

    public Attack getAttack() {
        return new Attack(attack, doubleDamageChance, getCount(), special.flanking, special.trample);
    }

    public void setSpecial(Special special) {
        this.special = special;
    }

    public Integer getCount() {
        return count;
    }

    public void setExpectedAttack(Integer expectedAttack) {
        this.expectedAttack = expectedAttack;
    }

    public BattleData getBattleData() {
        return battleData;
    }

    public void setBattleData(BattleData battleData) {
        this.battleData = battleData;
    }
    public int getTotalHealth(){
        return this.singleHealth * this.count;
    }
    public int getFlankingPriority() {
        return round(-(13 * (120000 - maxHealth) + damageOrder));
    }

    public void recover() {
        this.singleHealth = this.maxCount * this.maxHealth;
    }

    public void damage(int damage) {
        currentHealth -= damage;
    }

    public Integer getMaxHealth() {
        return maxHealth;
    }

    public Integer getCurrentHealth() {
        return currentHealth;
    }

    public boolean isDead() {
        return currentHealth <= 0;
    }

    public int getRemainder() {
        if (currentHealth == 0){
            return 0;
        }
        else if (currentHealth % maxHealth == 0){
            return maxHealth;
        }
        else {
            return currentHealth % maxHealth;
        }
    }

    public void setCount(int count) {
        this.count = count;
    }
}
