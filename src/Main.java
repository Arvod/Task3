import Creature.*;


import java.util.ArrayList;


public class Main {

    public static ArrayList<Creature> arm1 = new ArrayList<Creature>();
    public static ArrayList<Creature> arm2 = new ArrayList<Creature>();
    static Current1 current1;
    static Current2 current2;

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Creature.addNewCreature(Main.arm1);
            Creature.addNewCreature(Main.arm2);
        }

        for (Creature creatures : Main.arm1) {
            System.out.println(creatures);
        }
        System.out.println("TWO");
        for (Creature creatures : Main.arm2) {
            System.out.println(creatures);
        }
        System.out.println("\n");
        current2 = new Current2();
        Thread th2 = new Thread(current2);
        th2.start();
        current1 = new Current1();
        Thread th1 = new Thread(current1);
        th1.start();




    }
}
