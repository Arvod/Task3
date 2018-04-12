import Creature.Creature;
import java.util.ArrayList;
import java.util.Random;

public class Battle{

    public static ArrayList<Creature> play(ArrayList<Creature> arm1, ArrayList<Creature> arm2) throws Exception {
        Random random = new Random();
        for (Creature creatures : arm1) {
            creatures.hitCreature( arm2 );
            creatures.getAbility().useAbility(arm1, arm2, creatures);
            System.out.println();
        }
        ArrayList<Creature> arm = new ArrayList<Creature>();
        for (Creature creature : arm2) {
            if (!creature.isDead()) {
                arm.add(creature);
                }
            else{
                System.out.println(creature.getName() + " DIED!");
            }
        }
        return arm;
    }
}
