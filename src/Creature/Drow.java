package Creature;

import Ability.Ability;
import Weapon.Weapon;

public class Drow extends Creature {

    public final static int MAX_HIT_POINTS = 105;
    public final static int ATTACK_DAMAGE = 25;
    public final static int PROTECTION = 10;

    public Drow(String name, Weapon weapon, Ability ability) {
        super(name, MAX_HIT_POINTS, ATTACK_DAMAGE, PROTECTION, weapon, ability);
    }

    @Override
    public int maxHitPoints() {
        return MAX_HIT_POINTS;
    }

    @Override
    public void printInfoOfCreature() {
        System.out.println("Drows – magicians for mass fights. Drow is the valuable fighter in any group " +
                "because of the skill to cause a damage simultaneously to many opponents.");

    }

}
