package Ability;

import Creature.Creature;

public class HealAbility extends Ability {

    private static int defaultAbilityHeal = 9;
    private int abilityHeal;

    public HealAbility() {
        super("HealAbility", Type.FRIEND);
        this.abilityHeal = defaultAbilityHeal;
    }

    public HealAbility(int abilityHeal) {
        super("HealAbility", Type.FRIEND);
        this.abilityHeal = abilityHeal;
    }

    @Override
    protected void getEffect(Creature mySelf, Creature friend) {
        System.out.println("'" + mySelf.getName() + "' use HealAbility on " + friend.getName()
                + " and heal on " + friend.receiveHealth(abilityHeal) + "; '"
                + friend.getName() + "' HP = " + friend.getHitPoints());
    }

    @Override
    public void printInfoOfAbility() {
        System.out.println("Cure an ally, but we do not resurrect it.");
    }
}
