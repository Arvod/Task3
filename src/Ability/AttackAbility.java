package Ability;

import Creature.Creature;

public class AttackAbility extends Ability{

    private static int defaultAbilityDamage = 8;
    private int abilityDamage;

    public AttackAbility() {
        super("AttackAbility", Type.ENEMY);
        this.abilityDamage = defaultAbilityDamage;
    }

    public AttackAbility(int abilityDamage) {
        super("AttackAbility", Type.ENEMY);
        this.abilityDamage = abilityDamage;
    }

    @Override
    protected void getEffect(Creature mySelf, Creature enemy) {
        System.out.println("'" + mySelf.getName() + "' use AttackAbility on "
                + enemy.getName() + " and hit on " + enemy.receiveDamage(abilityDamage)
                + "; '" + enemy.getName() + "' HP = " + enemy.getHitPoints());
    }

    @Override
    public void printInfoOfAbility() {
        System.out.println("Create a sledgehammer and throw it at the enemy");
    }
}
