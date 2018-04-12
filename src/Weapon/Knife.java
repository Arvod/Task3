package Weapon;

public class Knife extends Weapon {
    private static final int defaultWeaponAttack = 5;
    private static final int defaultWeaponCriticalChance = 10;

    public Knife() {
        super("Knife", defaultWeaponAttack, defaultWeaponCriticalChance);
    }

    @Override
    public void printInfoOfWeapon() {
        System.out.println("An instrument composed of a blade fixed into a handle, used for cutting or as a weapon.(5,70)");
    }
}
