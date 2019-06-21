package AdventureGame.Players.Mages;

import AdventureGame.Players.Player;

public abstract class Mage extends Player {
    public int abilityValue;
    public int spellDamage;

    public Mage(String name, int healthPoints, int abilityValue, int spellDamage) {
        super(name, healthPoints, abilityValue);

        this.abilityValue = abilityValue;
        this.spellDamage = spellDamage;

    }

    public int getAbilityValue(){
        return this.abilityValue;
    }
}
