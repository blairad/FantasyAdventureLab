package AdventureGame.Players.Fighter;

import AdventureGame.Enums.Weapons;
import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.IWeapon;

public class Dwarf extends Fighter implements IWeapon, IDefend {

    Weapons weapon;

    public Dwarf(String name, int healthPoints, int defendAttack, Weapons weapon) {
        super(name, healthPoints, defendAttack);
        this.weapon = weapon;
    }

    public void Attack(int damageInflicted){
        healthPoints -= damageInflicted;
    }

    public Weapons getWeapon(){
        return this.weapon;
    }

    public int defendAttack(int attackDefended){
        return attackDefended;
    }

    public int currentHealthPoints(){return healthPoints;}

    public int calculateHealthAfterDamage(int weaponDamage) {
        return this.healthPoints -= weaponDamage;
    }

}
