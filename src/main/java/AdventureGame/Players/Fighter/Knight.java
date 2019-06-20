package AdventureGame.Players.Fighter;

import AdventureGame.Interfaces.IWeapon;


public class Knight extends Fighter implements IWeapon {

    Weapons weapon;

    public Knight(String name, int healthPoints, int damagePoints, Weapons weapon) {
        super(name, healthPoints, damagePoints);
        this.weapon = weapon;
    }


    public int weaponDamage(){
        return this.weapon.getDamage();
    }

    public Weapons getWeapon(){
        return this.weapon;
    }
}
