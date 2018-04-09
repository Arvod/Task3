package Weapon;

public class Axe extends Weapon {
    public Axe() {
        super("Axe",10, 30);
    }

    @Override
    public void printInfo() {
        System.out.println("A tool typically used for chopping wood, usually a steel blade attached at a right angle to a wooden handle.(10,30)");
    }
}
