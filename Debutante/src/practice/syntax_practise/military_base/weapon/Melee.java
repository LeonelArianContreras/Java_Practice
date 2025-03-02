package practice.syntax_practise.military_base.weapon;

public class Melee extends Weapon {

    private int sharpness; // Between 1 and 5

    public Melee(int sharpness, String name, double range, double damage) {
        super(name, range, damage);
        this.setSharpness(sharpness);
    }

    public int getSharpness() {
        return sharpness;
    }

    private void setSharpness(int sharpness) { // Private due to encapsulation
        this.sharpness = Math.min(5, Math.max(sharpness, 0));
    }

    public void sharpMeleeWeapon() {
        this.setSharpness(this.sharpness + 1);
    }

    public void attack() { // ToDo
        this.setSharpness(this.sharpness - 1);
    }

    public boolean canAttack() {} // ToDo
}