package AdventureGame.Players.Fighter;

import AdventureGame.Enums.Weapons;
import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.IWeapon;


public class Knight extends Fighter implements IWeapon, IDefend {

    Weapons weapon;

    public Knight(String name, int healthPoints, int damagePoints, Weapons weapon, int defendAttack) {
        super(name, healthPoints, damagePoints, defendAttack);
        this.weapon = weapon;
    }

    public void Attack(int damageInflicted){
        healthPoints -= damageInflicted;
    }

    public Weapons getWeapon(){
        return this.weapon;
    }

    public int defendAttack(int defendAttack){
        return this.attackDefended;}
}
