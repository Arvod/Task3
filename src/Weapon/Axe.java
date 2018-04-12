package Weapon;

public class Axe extends Weapon {
    private static final int defaultWeaponAttack = 10;
    private static final int defaultWeaponCriticalChance = 2;

    public Axe() {
        super("Axe", defaultWeaponAttack, defaultWeaponCriticalChance);
    }

    @Override
    public void printInfoOfWeapon() {
        System.out.println("A tool typically used for chopping wood, usually a steel blade attached at a right angle to a wooden handle.(10,30)");
    }
}
