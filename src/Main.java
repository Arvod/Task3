import Ability.*;
import Creature.*;
import Weapon.*;


import java.beans.beancontext.BeanContext;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        weapons.add(new Knife());
        weapons.add(new Axe());
        weapons.add(new Sword());
        weapons.add(new Knuckles());
        ArrayList<Ability> abilities = new ArrayList<Ability>();
        abilities.add(new AttackAbility());
        abilities.add(new HealAbility());
        abilities.add(new ProtectAbility());
        System.out.println(weapons.size());
        for(Weapon i : weapons){
            System.out.println(i);
        }
        ArrayList<Creature> arm1 = new ArrayList<Creature>();
        arm1.add(new Doctor("Doctor1", weapons.get( (int)(Math.random() * 4)), abilities.get(1) ) );
        arm1.add(new Fighter("FighterAttack1", weapons.get( (int)(Math.random() * 4) ), abilities.get(0) ) );
        arm1.add(new Fighter("FighterProtected1", weapons.get( (int)(Math.random() * 4) ), abilities.get(2) ) );
        arm1.add(new Hunter("AttackHunt1", weapons.get( (int)(Math.random() * 4)), abilities.get(0)) );
        arm1.add(new Hunter("ProtectedHunt1", weapons.get( (int)(Math.random() * 4)), abilities.get(2)) );
        arm1.add(new Rogue("Rogue", weapons.get( (int)(Math.random() * 4)), abilities.get(0) ) );
        ArrayList<Creature> arm2 = new ArrayList<Creature>();
        arm2.add(new Doctor("Doctor2", weapons.get( (int)(Math.random() * 4)), abilities.get(1) ) );
        arm2.add(new Fighter("FighterAttack2", weapons.get( (int)(Math.random() * 4) ), abilities.get(0) ) );
        arm2.add(new Fighter("FighterProtected2", weapons.get( (int)(Math.random() * 4) ), abilities.get(2) ) );
        arm2.add(new Hunter("AttackHunt2", weapons.get( (int)(Math.random() * 4)), abilities.get(0)) );
        arm2.add(new Hunter("ProtectedHunt2", weapons.get( (int)(Math.random() * 4)), abilities.get(2)) );
        arm2.add(new Rogue("Rogue2", weapons.get( (int)(Math.random() * 4)), abilities.get(0) ) );

        for (Creature creatures: arm1) {
            System.out.println(creatures);
        }
        for (Creature creatures: arm2) {
            System.out.println(creatures);
        }
        System.out.println("/n\n");
        boolean t = true;
        while(t){
            try {
                System.out.println("Beginning 1");
                Battle.play(arm1, arm2, abilities);
                System.out.println("Finish 1 \nBeginning 2");
                Battle.play(arm2, arm1, abilities);
                System.out.println("Finish 2 ");
                if(arm1.size() == 0){
                    t = false;
                    System.out.println("Win arm2");
                }else if(arm2.size() == 0){
                    t = false;
                    System.out.println("Win arm1");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
