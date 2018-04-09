package Creature;

import Weapon.Weapon;
import Ability.Ability;

import java.util.Objects;

public abstract class Creature {
    protected String name;
    protected int hitPoints;
    protected int attackDamage;
    protected int protection;
    protected final static int MIN_HIT_POINTS = 0;
    protected Weapon weapon;
    protected Ability ability;

    public abstract void printInfo();
    public abstract int maxHitPoints();

    public Creature(String name, int hitPoints, int attackDamage, int protection, Weapon weapon, Ability ability) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackDamage = attackDamage;
        this.protection = protection;
        this.weapon = weapon;
        this.ability = ability;
    }

    public void hitCreature(Creature enemy){
        enemy.hitPoints -=  weapon.getWeaponAttack() *(1+this.attackDamage/100) * (1-this.protection / 100);
        if(enemy.hitPoints < 0){
            enemy.hitPoints = MIN_HIT_POINTS;
        }
        System.out.println(this.getName() + " hit " + enemy.getName() + " with a weapon " + this.weapon.getName() +
                " on " + weapon.getWeaponAttack() *(1+this.attackDamage/100) * (1-this.protection / 100) +
                "; " + enemy.getName() + " HP = " + enemy.getHitPoints()
        );
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getProtection() {
        return this.protection;
    }

    public void setProtection(int potection) {
        this.protection = potection;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Creature)) return false;
        Creature creature = (Creature) o;
        return getHitPoints() == creature.getHitPoints() &&
                getAttackDamage() == creature.getAttackDamage() &&
                protection == creature.protection &&
                Objects.equals(getName(), creature.getName()) &&
                Objects.equals(weapon, creature.weapon) &&
                Objects.equals(ability, creature.ability);
    }


    @Override
    public int hashCode() {

        return Objects.hash(getName(), getHitPoints(), getAttackDamage(), protection, weapon, ability);
    }

    @Override
    public String toString() {
        return "name: '" + this.name + '\'' +
                ", hitPoints: " + this.hitPoints +
                ", attackDamage: " + this.attackDamage +
                ", potection: " + this.protection +
                "; \nName of Weapon: " + this.weapon.getName() +
                ", weaponAttack: " + this.weapon.getWeaponAttack() +
                ", weaponCriticalChance: " + this.weapon.getWeaponCriticalChance() + "\n";
    }
}

