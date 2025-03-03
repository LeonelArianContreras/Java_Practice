package practice.syntax_practise.military_base.weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Firearm extends Weapon {

    private int ammo;
    private int fireRate;
    private int aim;
    private final int caliber;
    private List<Accessory> accessories;

    public Firearm(String name, double range, double baseDamage, int ammo, int caliber, int fireRate, int aim) {
        super(name, baseDamage, range);
        this.ammo = ammo;
        this.caliber = caliber;
        this.fireRate = fireRate;
        this.aim = aim;
        this.accessories = new ArrayList<>();
    }

    public int getAmmo() {
        return ammo;
    }

    public int getCaliber() {
        return caliber;
    }

    public int getBaseFireRate() {
        return fireRate;
    }

    public int getBaseAim() {
        return aim;
    }

    public boolean canBeUsed() {
        return ammo > 0;
    }

    public void useWeapon() {
        ammo--;
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public void removeAccessory(Accessory accessory) {
        accessories.remove(accessory);
    }

    public double getTotalDamage() {
        return caliber * this.getTotalAim() * this.getTotalFireRate() * this.getBaseDamage() / Math.max(1, this.getRange()); // Be careful with arithmetic errors
    }

    public int getTotalAim() {
        return accessories.stream().mapToInt(Accessory :: getAimPlus).sum() + this.getBaseAim();
    }

    public int getTotalFireRate() {
        return accessories.stream().mapToInt(Accessory :: getFireRatePlus).sum() + this.getBaseFireRate();
    }

}