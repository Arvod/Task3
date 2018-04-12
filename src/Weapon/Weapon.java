package Weapon;

import java.util.ArrayList;
import java.util.Random;

public abstract class Weapon {
    protected String name;
    protected int weaponAttack;
    protected int weaponCriticalChance;

    public Weapon(String name, int weaponAttack, int weaponCriticalChance) {
        this.name = name;
        this.weaponAttack = weaponAttack;
        this.weaponCriticalChance = weaponCriticalChance;
    }

    public int weaponDamage() {
        Random random = new Random();
        if(this.weaponCriticalChance <= random.nextInt(101)){
            return this.weaponAttack;
        }else
            return this.weaponAttack*3;
    }

    public static ArrayList<Weapon> getWeapon(){
        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        weapons.add(new Axe());
        weapons.add(new Knife());
        weapons.add(new Knuckles());
        weapons.add(new Sword());
        return weapons;
    }

    public abstract void printInfoOfWeapon();

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
        return "Name of weapon: '" + this.name
                +"', weaponAttack: " + this.weaponAttack
                + ", weaponCriticalChance: " + this.weaponCriticalChance;
    }
}


