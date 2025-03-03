package practice.syntax_practise.military_base.weapon;

public class HybridWeapon {

    private Firearm firearm;
    private Melee melee;

    public HybridWeapon(Firearm firearm, Melee melee) {
        this.firearm = firearm;
        this.melee = melee;
    }

    public boolean canBeUsed() {
        return firearm.canBeUsed() && melee.canBeUsed();
    }

    public void useWeapon() {
        firearm.useWeapon();
        melee.useWeapon();
    }

    public double getTotalDamage() {
        return firearm.getTotalDamage() + melee.getTotalDamage();
    }
}