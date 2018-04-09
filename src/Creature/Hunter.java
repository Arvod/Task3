package Creature;

import Ability.Ability;
import Weapon.Weapon;

public class Hunter extends Creature {

    protected final static int MAX_HIT_POINTS = 110;

    public Hunter(String name, Weapon weapon, Ability ability) {
        super(name, MAX_HIT_POINTS, 41, 31, weapon, ability);
    }

    @Override
    public int maxHitPoints() {
        return MAX_HIT_POINTS;
    }

    @Override
    public void printInfo() {
        System.out.println("Nobody can compare with a hunter in tracking down a victim, the slightest imprint, a broken twig will bring him to the trail. And to escape from it is not always so easy...");
    }
}
