package backend.entities;

public class Unit {
    public String faction;
    public String name;
    public Integer health;
    public Integer attack;
    public float doubleDamageChance;
    public float damageOrder;
    public String special;

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
}
