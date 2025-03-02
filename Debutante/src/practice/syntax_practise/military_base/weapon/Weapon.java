package practice.syntax_practise.military_base.weapon;

import java.util.List;
import java.util.ArrayList;

public abstract class Weapon {

    private String name; // Just FF
    private double damage; // To attack method
    private double range; // To attack method

    public Weapon(String name, double damage, double range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }
    // Getters
    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public double getRange() {
        return range;
    }

    public abstract void attack(); // Abstract so as to obligate herences to have this method
    public abstract boolean canAttack();

}

