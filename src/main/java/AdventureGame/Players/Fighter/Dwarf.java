package AdventureGame.Players.Fighter;

import AdventureGame.Enums.Weapons;
import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.IWeapon;

public class Dwarf extends Fighter implements IWeapon, IDefend {

    Weapons weapon;

    public Dwarf(String name, int healthPoints, int damagePoints, int defendAttack, Weapons weapon) {
        super(name, healthPoints, damagePoints, defendAttack);
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
