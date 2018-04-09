package Creature;

import Ability.Ability;
import Weapon.Weapon;

public class Rogue extends Creature {

    protected final static int MAX_HIT_POINTS = 105;

    public Rogue(String name, Weapon weapon, Ability ability) {
        super(name, MAX_HIT_POINTS , 48, 5, weapon, ability);
    }

    @Override
    public int maxHitPoints() {
        return MAX_HIT_POINTS;
    }

    @Override
    public void printInfo() {
        System.out.println("Spit on universal hatred, the death penalty for raiding and their photos, pasted on every column with the inscription \"Wanted, better dead\", become real robbers.");
    }
}
