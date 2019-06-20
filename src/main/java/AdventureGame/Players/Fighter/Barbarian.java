package AdventureGame.Players.Fighter;

import AdventureGame.Interfaces.IWeapon;

public class Barbarian extends Fighter implements IWeapon {
    public Barbarian(String name, int healthPoints, int damagePoints) {
        super(name, healthPoints, damagePoints);
    }
}
