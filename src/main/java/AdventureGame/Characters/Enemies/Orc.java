package AdventureGame.Characters.Enemies;

import AdventureGame.Enums.Weapons;
import AdventureGame.Interfaces.IWeapon;

public class Orc extends Enemy implements IWeapon {

    Weapons weapon;

    public Orc(int healthPoints, String enemyType, Weapons weapon) {
        super(healthPoints, enemyType);
    }

    public void Attack(int damageInflicted){
        healthPoints -= damageInflicted;
    }

    public Weapons getWeapon(){
        return this.weapon;
    }

}
