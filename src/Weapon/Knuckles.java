package Weapon;

public class Knuckles extends Weapon {
    private static final int defaultWeaponAttack = 4;
    private static final int defaultWeaponCriticalChance = 12;

    public Knuckles() {
        super("Knuckles",defaultWeaponAttack, defaultWeaponCriticalChance);
    }

    @Override
    public void printInfoOfWeapon() {
        System.out.println("A part of a finger at a joint where the bone is near the surface, especially where the finger joins the hand.(4,90)");
    }
}
