package practice.syntax_practise.military_base.weapon;

import java.util.List;
import java.util.ArrayList;

public abstract class Weapon {

    protected final String name; // Just FF
    protected final double baseDamage; // To attack method
    protected double range; // To attack method

    public Weapon(String name, double baseDamage, double range) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.range = range;
    }

    public double getBaseDamage() { return baseDamage; }

    public String getName() {
        return name;
    }

    public double getRange() {
        return range;
    }

    // Abstract in order to obligate herences to have this method
    public abstract void useWeapon();
    public abstract boolean canBeUsed();
    public abstract double getTotalDamage();

}

