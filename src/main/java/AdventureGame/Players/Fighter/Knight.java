package AdventureGame.Players.Fighter;

import AdventureGame.Enums.Weapons;
import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.IWeapon;


public class Knight extends Fighter implements IWeapon, IDefend {

    Weapons weapon;

    public Knight(String name, int healthPoints, Weapons weapon, int defendAttack) {
        super(name, healthPoints, defendAttack);
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

    public int currentHealthPoints(){return healthPoints;}

    public int calculateHealthAfterDamage(int weaponDamage) {
        return this.healthPoints -= weaponDamage;
    }
}
