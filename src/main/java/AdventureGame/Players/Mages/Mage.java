package AdventureGame.Players.Mages;

import AdventureGame.Players.Player;

public abstract class Mage extends Player {
    public int abilityValue;
    public int spellDamage;
    public int defendAttack;

    public Mage(String name, int healthPoints, int abilityValue, int spellDamage, int defendAttack) {
        super(name, healthPoints, abilityValue, defendAttack);

        this.abilityValue = abilityValue;
        this.spellDamage = spellDamage;
        this.defendAttack = defendAttack;

    }

    public int getAbilityValue(){
        return this.abilityValue;
    }

}
