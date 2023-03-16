package backend.entities.helper;

public class Attack {
    private final int power;
    private final double crit;
    private final int amount;
    private final boolean flanking;
    private final boolean trample;

    public Attack(int power, double crit, int amount, boolean flanking, boolean trample) {
        this.power = trample ? 1 : power;
        this.crit = crit;
        this.amount = trample ? (int) (power * amount * (1 + crit)) : amount;
        this.flanking = flanking;
        this.trample = trample;
    }

    public int getPower() {
        return power;
    }

    public double getCrit() {
        return crit;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isFlanking() {
        return flanking;
    }

    public boolean isTrample() {
        return trample;
    }
}

