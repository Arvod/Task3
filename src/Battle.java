import Creature.Creature;
import Ability.Ability;
import java.util.ArrayList;

public class Battle {
    public static void play(ArrayList<Creature> arm1, ArrayList<Creature> arm2,  ArrayList<Ability> abilities)throws Exception {
        int n1 = arm1.size();
        int n2 = arm2.size();
        for (Creature creatures : arm1) {
            creatures.hitCreature(arm2.get((int) (Math.random() * n2)));
            if (creatures.getAbility().getName() == abilities.get(0).getName()) {
                creatures.getAbility().useAbility(arm2.get((int) (Math.random() * n2)));
            } else if (creatures.getAbility().getName() == abilities.get(1).getName()) {
                creatures.getAbility().useAbility(arm1.get((int) (Math.random() * n1)));
            } else if (creatures.getAbility().getName() == abilities.get(2).getName()) {
                creatures.getAbility().useAbility(creatures);
            }
            System.out.println();
        }
        for (int i = 0; i < n2; i++){
            if(arm2.get(i).getHitPoints() == 0){
                System.out.println(arm2.get(i).getName() + " DIE! ");
                arm2.remove(arm2.get(i));
                i--; n2--;
            }
        }
    }
}
