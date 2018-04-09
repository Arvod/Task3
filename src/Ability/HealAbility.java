package Ability;

import Creature.Creature;

public class HealAbility extends Ability {
    public HealAbility() {
        super("HealAbility");
    }

    @Override
    public void useAbility(Creature creature) {
        creature.setHitPoints( creature.getHitPoints() + 10 );
        if( creature.getHitPoints() > creature.maxHitPoints() ){
            creature.setHitPoints( creature.maxHitPoints() );
        } else{
            System.out.println(creature.getName() + " heal 10 HP; HP=" + creature.getHitPoints());
        }
    }
}
