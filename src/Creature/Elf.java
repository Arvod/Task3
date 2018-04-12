package Creature;

import Ability.Ability;
import Weapon.Weapon;

public class Elf extends Creature {

    public final static int MAX_HIT_POINTS = 100;
    public final static int ATTACK_DAMAGE = 30;
    public final static int PROTECTION = 10;

    public Elf(String name, Weapon weapon, Ability ability) {
        super(name, MAX_HIT_POINTS, ATTACK_DAMAGE, PROTECTION, weapon, ability);
    }

    @Override
    public int maxHitPoints() {
        return MAX_HIT_POINTS;
    }

    @Override
    public void printInfoOfCreature() {
        System.out.println("Elves – dexterous and quick killers. " +
                "The main advantage – a high class armour, high chance to hit and backstab abillity.");

    }


}
