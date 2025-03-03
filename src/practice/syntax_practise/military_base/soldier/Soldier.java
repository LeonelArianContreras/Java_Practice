package practice.syntax_practise.military_base.soldier;

import practice.syntax_practise.military_base.weapon.Weapon;

import java.util.Comparator;

import java.util.List;
import java.util.ArrayList;

public class Soldier {

    private String name;
    private double health;
    private boolean alive;
    private int honorStars;
    private Rank rank;
    private List<Weapon> weapons;

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public int getHonorStars() {
        return honorStars;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public void removeWeapon(Weapon weapon) {
        weapons.remove(weapon);
    }

    public void grabStars(int newHonorStars) {
        honorStars += newHonorStars;
        this.verifyRankUp(honorStars);
    }

    public void attackTo(Soldier soldier) {
        if(this.canAttackTo(soldier)) {
            soldier.receiveAttack(soldier);
        }
        else {
            soldier.attackTo(this);
        }
    }

    public boolean canAttackTo(Soldier soldier) {
        return (rank.getRank() >= soldier.rank.getRank() || this.totalDamage() >= soldier.totalDamage()) && !this.withAmmoWeapons().isEmpty();
    }

    public void receiveAttack(Soldier soldier) {
        this.verifyHealth(soldier.maxDamage());
        this.grabStars(soldier.honorStars);
    }

    public void verifyHealth(double damage) {
        if(health <= damage)
            this.setAlive(false);
        else
            health -= damage;
    }

    public double totalDamage() {
        return weapons.stream().mapToDouble(Weapon :: getTotalDamage).sum();
    }

    public Weapon bestWeapon() {
        return this.withAmmoWeapons().stream().max(Comparator.comparingDouble(Weapon :: getTotalDamage)).orElse(null);
    }

    public double maxDamage() {
        return this.bestWeapon().getTotalDamage();
    }

    public void verifyRankUp(int honorStars) {
        rank = rank.rankUp(honorStars / 5); // If soldier has less than 5, the parameter will be 0
    }

    public List<Weapon> withAmmoWeapons() {
        return weapons.stream().filter(Weapon :: canBeUsed).toList();
    }

    public void dropWeapon(Weapon weapon) {
        weapons.remove(weapon);
    }

}