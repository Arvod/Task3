package Weapon;

public class Sword extends Weapon {
    private static final int defaultWeaponAttack = 8;
    private static final int defaultWeaponCriticalChance = 6;

    public Sword() {
        super("Sword",defaultWeaponAttack, defaultWeaponCriticalChance);
    }

    @Override
    public void printInfoOfWeapon() {
        System.out.println("A weapon with a long metal blade and a hilt with a hand guard, used for thrusting or striking and now typically worn as part of ceremonial dress.(7,60)");
    }
}
