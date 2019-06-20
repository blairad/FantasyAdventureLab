package AdventureGame.Players.Mages;

import AdventureGame.Players.Player;

public abstract class Mage extends Player {
    int abilityValue;

    public Mage(String name, int healthPoints, int abilityValue) {
        super(name, healthPoints);

        this.abilityValue = abilityValue;

    }

    public int getAbilityValue(){
        return this.abilityValue;
    }
}
