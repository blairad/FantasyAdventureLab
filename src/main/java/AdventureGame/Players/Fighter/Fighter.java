package AdventureGame.Players.Fighter;

import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.IWeapon;
import AdventureGame.Players.Player;

public abstract class Fighter extends Player implements IWeapon, IDefend {

    public Fighter(String name, int healthPoints, int attackDefended) {
        super(name, healthPoints, attackDefended);

        this.attackDefended = 5;
    }

    protected int attackDefended;

    public int attackDefended() {
        return attackDefended;
    }


}
