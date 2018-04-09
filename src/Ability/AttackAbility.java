package Ability;

import Creature.Creature;

public class AttackAbility extends Ability{

    public AttackAbility() {
        super("AttackAbility");
    }

    @Override
    public void useAbility(Creature enemy) {
        if(enemy.getHitPoints() <= 50){
            enemy.setHitPoints( ( enemy.getHitPoints() - 7 ) * ( 1 - enemy.getProtection() / 100 ) );
            if(enemy.getHitPoints() <= 0){
                enemy.setHitPoints(0);
            }
            System.out.println(enemy.getName() + " lost " + (7 * ( 1 - enemy.getProtection() / 100 ) ) + " HP, HP =" + enemy.getHitPoints());
        } else {
            enemy.setHitPoints((enemy.getHitPoints() - 9) * (1 - enemy.getProtection() / 100));
            if(enemy.getHitPoints() <= 0){
                enemy.setHitPoints(0);
            }
            System.out.println(enemy.getName() + " lost " + (9 * ( 1 - enemy.getProtection() / 100 ) ) + " HP, HP =" + enemy.getHitPoints());
        }
    }
}
