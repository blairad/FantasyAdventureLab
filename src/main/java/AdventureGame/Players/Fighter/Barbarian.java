package AdventureGame.Players.Fighter;

import AdventureGame.Enums.Weapons;
import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.IWeapon;

public class Barbarian extends Fighter implements IWeapon, IDefend {

    Weapons weapon;

    public Barbarian(String name, int healthPoints, int damagePoints, int attackDefended, Weapons weapon) {
        super(name, healthPoints, damagePoints, attackDefended);
        this.weapon = weapon;
    }

    public void Attack(int damageInflicted){
        healthPoints -= damageInflicted;
    }

    public Weapons getWeapon(){
        return this.weapon;
    }

    public int defendAttack(int defendAttack) {
        return attackDefended;
    }

}
