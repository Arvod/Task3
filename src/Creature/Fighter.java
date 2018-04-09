package Creature;

import Ability.Ability;
import Weapon.Weapon;

public class Fighter extends Creature {

    protected final static int MAX_HIT_POINTS = 115;

    public Fighter(String name, Weapon weapon, Ability ability) {
        super(name, MAX_HIT_POINTS, 30, 35, weapon, ability);
    }

    @Override
    public int maxHitPoints() {
        return MAX_HIT_POINTS;
    }

    @Override
    public void printInfo() {
        System.out.println("Known throughout the archipelago as fearless and devoted mercenaries, skillful and disciplined guards, elite bodyguards");
    }

}
