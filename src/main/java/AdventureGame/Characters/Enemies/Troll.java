package AdventureGame.Characters.Enemies;

import AdventureGame.Enums.Weapons;
import AdventureGame.Interfaces.IWeapon;

public class Troll extends Enemy implements IWeapon {

    Weapons weapon;

    public Troll(int healthPoints, String enemyType, Weapons weapon) {
        super(healthPoints, enemyType);

        this.weapon = weapon;
    }

    public void Attack(int damageInflicted){
        healthPoints -= damageInflicted;
    }

    public Weapons getWeapon(){
        return this.weapon;
    }



}
