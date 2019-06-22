package AdventureGame.Players.Fighter;

import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.IWeapon;

public class Barbarian extends Fighter implements IWeapon, IDefend {

    Weapons weapon;

    public Barbarian(String name, int healthPoints, int damagePoints, int attackDefended, Weapons weapon) {
        super(name, healthPoints, damagePoints, attackDefended);
        this.weapon = weapon;
    }

    public int weaponDamage(){
        return this.weapon.getDamage();
    }

    public Weapons getWeapon(){
        return this.weapon;
    }

    public int defendAttack(int attackDefended){
        return attackDefended;

    }

}
