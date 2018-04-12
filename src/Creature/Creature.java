package Creature;

import Weapon.Weapon;
import Ability.Ability;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public abstract class Creature {
    protected String name;
    protected int hitPoints;
    protected int attackDamage;
    protected int protection;
    protected boolean isDead = false;
    protected Weapon weapon;
    protected Ability ability;

    public abstract void printInfoOfCreature();
    public abstract int maxHitPoints();

        public Creature(String name, int hitPoints, int attackDamage, int protection, Weapon weapon, Ability ability) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackDamage = attackDamage;
        this.protection = protection;
        this.weapon = weapon;
        this.ability = ability;
    }

    public Creature(Creature creature) {
        this.name = creature.name;
        this.hitPoints = creature.hitPoints;
        this.attackDamage = creature.attackDamage;
        this.protection = creature.protection;
        this.weapon = creature.weapon;
        this.ability = creature.ability;
    }

    public void hitCreature(Creature enemy){
        int damage = weapon.weaponDamage() * (1 + this.attackDamage / 100);
        System.out.println("'" + this.getName() + "' hit '" + enemy.getName() + "' with a weapon " + this.weapon.getName() +
                " on " + enemy.receiveDamage(damage) +
                "; '"+ enemy.getName() + "' HP = " + enemy.getHitPoints()
        );
    }

    public void hitCreature(ArrayList<Creature> enemy){
        Random random = new Random();
        this.hitCreature( enemy.get( random.nextInt( enemy.size() ) ) );
    }

    public int receiveDamage(int damage){
        int receiveDamage = damage * (1 - this.protection / 100);
        this.hitPoints -= receiveDamage;
        if( this.hitPoints <= 0 ){
            this.isDead = true;
            this.hitPoints = 0;
        }
        return receiveDamage;
    }

    public int receiveHealth(int extraHitPoints){
        if(!this.isDead) {
            this.hitPoints += extraHitPoints;
            if (this.hitPoints >= this.maxHitPoints()) {
                extraHitPoints -= this.hitPoints - this.maxHitPoints();
                this.hitPoints = this.maxHitPoints();
            }
        }else{
            extraHitPoints = 0;
        }
        return extraHitPoints;
    }

    public int receiveProtect(int extraProtect){
        this.protection += extraProtect;
        if(this.protection >= 60){
            extraProtect -=  this.protection - 60;
            this.protection = 60;
        }
        return  extraProtect;
    }

    public static void addNewCreature(ArrayList<Creature> creature){
        ArrayList<Ability> abilities = Ability.getAbilities();
        ArrayList<Weapon> weapons = Weapon.getWeapon();
        Random random = new Random();
        int raceOfCreature = random.nextInt(5);
        switch (raceOfCreature){
            case 0:
                creature.add(
                        new Drow("Drow_" + random.nextInt(11),
                                weapons.get( random.nextInt( weapons.size() ) ),
                                abilities.get( random.nextInt( abilities.size() ) )
                        )
                );
                break;
            case 1:
                creature.add(
                        new Dwarf("Dwarf_" + random.nextInt(11),
                                weapons.get( random.nextInt( weapons.size() ) ),
                                abilities.get( random.nextInt( abilities.size() ) )
                        )
                );
                break;
            case 2:
                creature.add(
                        new Elf("Elf_" + random.nextInt(11),
                                weapons.get( random.nextInt( weapons.size() ) ),
                                abilities.get( random.nextInt( abilities.size() ) )
                        )
                );
                break;
            case 3:
                creature.add(
                        new Human("Human_" + random.nextInt(11),
                                weapons.get( random.nextInt( weapons.size() ) ),
                                abilities.get( random.nextInt( abilities.size() ) )
                        )
                );
                break;
            case 4:
                creature.add(
                        new Orc("Orc_" + random.nextInt(11),
                                weapons.get( random.nextInt( weapons.size() ) ),
                                abilities.get( random.nextInt( abilities.size() ) )
                        )
                );
                break;
        }
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

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
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

