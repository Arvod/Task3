package Ability;

import Creature.Creature;

public abstract class Ability {
    protected String name;

    public Ability(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void useAbility(Creature creature);


}
