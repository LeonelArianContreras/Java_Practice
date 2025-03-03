package practice.syntax_practise.military_base.weapon;

import java.util.List;
import java.util.ArrayList;

public abstract class Weapon {

    private String name; // Just FF
    private double baseDamage; // To attack method
    private double range; // To attack method

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

    // Abstract so as to obligate herences to have this method
    public abstract boolean canBeUsed();
    public abstract double getTotalDamage();

}

