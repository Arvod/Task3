package Weapon;

public abstract class Weapon {
    protected String name;
    protected int weaponAttack;
    protected int weaponCriticalChance;

    protected int weaponDamage() {
        if(this.weaponCriticalChance < (int)(Math.random() * (this.weaponCriticalChance+1))){
            return this.weaponAttack;
        }else
            return this.weaponAttack*3;
    }

    public abstract void printInfo();

    public Weapon(String name, int weaponAttack, int weaponCriticalChance) {
        this.name = name;
        this.weaponAttack = weaponAttack;
        this.weaponCriticalChance = weaponCriticalChance;
    }

    public int getWeaponAttack() {
        return this.weaponAttack;
    }

    public void setWeaponAttack(int weaponAttack) {
        this.weaponAttack = weaponAttack;
    }

    public int getWeaponCriticalChance() {
        return this.weaponCriticalChance;
    }

    public void setWeaponCriticalChance(int weaponCriticalChance) {
        this.weaponCriticalChance = weaponCriticalChance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                getClass().toString() +
                ", weaponAttack=" + weaponAttack +
                ", weaponCriticalChance=" + weaponCriticalChance +
                '}';
    }
}


