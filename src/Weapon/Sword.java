package Weapon;

public class Sword extends Weapon {
    public Sword() {
        super("Sword",7, 60);
    }

    @Override
    public void printInfo() {
        System.out.println("A weapon with a long metal blade and a hilt with a hand guard, used for thrusting or striking and now typically worn as part of ceremonial dress.(7,60)");
    }
}
