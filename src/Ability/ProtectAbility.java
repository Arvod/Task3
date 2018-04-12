package Ability;

import Creature.Creature;

public class ProtectAbility extends Ability {

    protected static int defaultAbilityBonusProtect = 1;
    protected int abilityBonusProtect;

    public ProtectAbility(int abilityBonusProtect) {
        super("ProtectAbility", Type.MYSELF);
        this.abilityBonusProtect = abilityBonusProtect;
    }

    public ProtectAbility() {
        super("ProtectAbility", Type.MYSELF);
        this.abilityBonusProtect = defaultAbilityBonusProtect;
    }

    @Override
    protected void getEffect(Creature mySelf, Creature any) {
        System.out.println("'" + mySelf.getName() + "' use ProtectAbility and get "
                + mySelf.receiveProtect(abilityBonusProtect) + "; '"
                + mySelf.getName() + "' Protect = " + mySelf.getProtection());
    }

    @Override
    public void printInfoOfAbility() {
        System.out.println("Strengthen armor");
    }
}
