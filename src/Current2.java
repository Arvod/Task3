import Creature.Creature;

import java.util.Scanner;

public class Current2 implements Runnable {

    @Override
    public void run() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();
            switch (n) {
                case "1":
                    Creature.addNewCreature(Main.arm1);
                    System.out.println("add in 1 arm" + Main.arm1.get( Main.arm1.size()-1 ));
                    break;
                case "2":
                    Creature.addNewCreature(Main.arm2);
                    System.out.println("add in 2 arm" + Main.arm2.get( Main.arm2.size()-1 ));
                    break;
                case "exit":
                    break;
            }
        }
    }
}
