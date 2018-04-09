package Creature;

import Ability.*;
import Weapon.Weapon;

public class Doctor extends Creature {
    public final static int MAX_HIT_POINTS = 95;
    public Doctor(String name, Weapon weapon, Ability ability) {
        super(name, MAX_HIT_POINTS, 10, 20, weapon, ability);
    }

    @Override
    public int maxHitPoints() {
        return MAX_HIT_POINTS;
    }

    @Override
    public void printInfo() {
        System.out.println("In a world that survived the apocalypse, only one thing is valued - life, and doctors skillfully trade this unique commodity.");
    }
}
