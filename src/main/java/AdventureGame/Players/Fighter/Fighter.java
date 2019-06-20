package AdventureGame.Players.Fighter;

import AdventureGame.Interfaces.IWeapon;
import AdventureGame.Players.Player;

public abstract class Fighter extends Player implements IWeapon {



    public Fighter(String name, int healthPoints, int weaponDamage) {
        super(name, healthPoints, weaponDamage);
    }
}
