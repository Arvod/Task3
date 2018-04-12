package Creature;

import Ability.Ability;
import Weapon.Weapon;

public class Orc extends Creature {

    public final static int MAX_HIT_POINTS = 120;
    public final static int ATTACK_DAMAGE = 20;
    public final static int PROTECTION = 25;

    public Orc(String name, Weapon weapon, Ability ability) {
        super(name, MAX_HIT_POINTS, ATTACK_DAMAGE, PROTECTION, weapon, ability);
    }

    @Override
    public int maxHitPoints() {
        return MAX_HIT_POINTS;
    }

    @Override
    public void printInfoOfCreature() {
        System.out.println("Orcs – the best warriors: strong, hardy, but slow.");

    }

}
