package Ability;

import Creature.Creature;

import java.util.ArrayList;
import java.util.Random;

public abstract class Ability {

    protected String name;
    protected Type type;

    public Ability(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    protected abstract void getEffect(Creature mySelf, Creature any);

    public void useAbility(Creature friend, Creature enemy, Creature mySelf){
        Random random = new Random();
        switch (type){
            case ENEMY:
                getEffect( mySelf, enemy );
                break;
            case FRIEND:
                getEffect( mySelf, friend );
                break;
            case MYSELF:
                getEffect( mySelf, null );
                break;
        }
    }

    public void useAbility(ArrayList<Creature> friend, ArrayList<Creature> enemy, Creature mySelf){
        Random random = new Random();
        switch (type){
            case ENEMY:
                getEffect( mySelf, enemy.get( random.nextInt( enemy.size() ) ) );
                break;
            case FRIEND:
                getEffect( mySelf, friend.get( random.nextInt( friend.size() ) ) );
                break;
            case MYSELF:
                getEffect( mySelf, null );
                break;
        }
    }

    public static ArrayList<Ability> getAbilities(){
        ArrayList<Ability> abilities = new ArrayList<Ability>();
        abilities.add(new AttackAbility());
        abilities.add(new HealAbility());
        abilities.add(new ProtectAbility());
        return abilities;
    }

    public abstract void printInfoOfAbility();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
