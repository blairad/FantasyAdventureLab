package AdventureGame.Players.Fighter;

import AdventureGame.Interfaces.IWeapon;

public class Barbarian extends Fighter implements IWeapon {
    public Barbarian(String name, int healthPoints, int damagePoints, int attackDefended) {
        super(name, healthPoints, damagePoints, attackDefended);
    }

    public int defendAttack(int attackDefended){
        return attackDefended;
    }

}
