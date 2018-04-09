package Ability;

import Creature.Creature;

public class ProtectAbility extends Ability {
    public ProtectAbility() {
        super("ProtectAbility");
    }

    @Override
    public void useAbility(Creature creature) {
        creature.setProtection(creature.getProtection() + 2) ;
        if(creature.getProtection() >= 100) {
            creature.setProtection(95);
        }
        System.out.println(creature.getName() + " +2 prote");
    }
}
