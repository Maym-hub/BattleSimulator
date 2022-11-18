package backend.entities;

public class Unit {
    public Integer id;
    public String faction;
    public String name;
    public Integer health;
    public Integer attack;
    public float doubleDamageChance;
    public float damageOrder;
    public String special;
    public Integer count = 0;
    public Integer expectedAttack = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public float getDoubleDamageChance() {
        return doubleDamageChance;
    }

    public void setDoubleDamageChance(float doubleDamageChance) {
        this.doubleDamageChance = doubleDamageChance;
    }

    public float getDamageOrder() {
        return damageOrder;
    }

    public void setDamageOrder(float damageOrder) {
        this.damageOrder = damageOrder;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getExpectedAttack() {
        return expectedAttack;
    }

    public void setExpectedAttack(Integer expectedAttack) {
        this.expectedAttack = expectedAttack;
    }
}
