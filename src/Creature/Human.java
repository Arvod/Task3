package Creature;

import Ability.Ability;
import Weapon.Weapon;

public class Human extends  Creature{

    public final static int MAX_HIT_POINTS = 110;
    public final static int ATTACK_DAMAGE = 20;
    public final static int PROTECTION = 20;

    public Human(String name, Weapon weapon, Ability ability) {
        super(name, MAX_HIT_POINTS, ATTACK_DAMAGE, PROTECTION, weapon, ability);
    }

    @Override
    public int maxHitPoints() {
        return MAX_HIT_POINTS;
    }

    @Override
    public void printInfoOfCreature() {
        System.out.println("Humans are magicians mainly for single style of game.");

    }

}
