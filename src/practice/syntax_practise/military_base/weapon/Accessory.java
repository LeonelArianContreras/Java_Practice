package practice.syntax_practise.military_base.weapon;

public class Accessory {

    private int aimPlus;
    private int fireRatePlus;

    public Accessory(int aimPlus, int fireRatePlus) {
        this.aimPlus = aimPlus;
        this.fireRatePlus = fireRatePlus;
    }

    public int getAimPlus() {
        return aimPlus;
    }

    public int getFireRatePlus() {
        return fireRatePlus;
    }
}