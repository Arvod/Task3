package Weapon;

public class Knife extends Weapon {
    public Knife() {
        super("Knife",5, 70);
    }

    @Override
    public void printInfo() {
        System.out.println("An instrument composed of a blade fixed into a handle, used for cutting or as a weapon.(5,70)");
    }
}
