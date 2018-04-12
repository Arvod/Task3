package Creature;

import Ability.Ability;
import Weapon.Weapon;

public class Dwarf extends Creature{

    public final static int MAX_HIT_POINTS = 115;
    public final static int ATTACK_DAMAGE = 15;
    public final static int PROTECTION = 30;

    public Dwarf(String name, Weapon weapon, Ability ability) {
        super(name, MAX_HIT_POINTS, ATTACK_DAMAGE, PROTECTION, weapon, ability);
    }

    @Override
    public int maxHitPoints() {
        return MAX_HIT_POINTS;
    }

    @Override
    public void printInfoOfCreature() {
        System.out.println("Dwarves – great and powerful defenders - exclusively social characters. " +
                "They carry out a role of the living shield in the group, accepting all impacts from enemies. ");

    }

}
