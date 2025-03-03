package practice.syntax_practise.military_base.base;

import practice.syntax_practise.military_base.address.Address;
import practice.syntax_practise.military_base.soldier.Soldier;

import java.util.List;
import java.util.ArrayList;

public class MilitaryBase {

    private Address address;
    private String name;
    private List<Soldier> army;

    public MilitaryBase(Address address, String name, List<Soldier> army) {
        this.address = address;
        this.name = name;
        this.army = (army != null) ? new ArrayList<>(army) : new ArrayList<>();
    }

    public void addSoldier(Soldier soldier) {
        army.add(soldier);
    }

    public void removeSoldier(Soldier soldier) {
        army.remove(soldier);
    }

    public List<Soldier> soldiersAlive() {
        return army.stream().filter(Soldier :: isAlive).toList();
    }

    public double totalPower() {
        return army.stream().mapToDouble(Soldier :: totalDamage).sum();
    }
}