package AdventureGame.Players.Mages;

import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.ISpell;
import AdventureGame.Players.Player;

public abstract class Mage extends Player implements IDefend, ISpell {
    public int abilityValue;
    public int defendAttack;

    public Mage(String name, int healthPoints, int abilityValue, int defendAttack) {
        super(name, healthPoints, abilityValue, defendAttack);

        this.abilityValue = abilityValue;
        this.defendAttack = defendAttack;

    }

    public int getAbilityValue(){
        return this.abilityValue;
    }

//    public int spellDamage(){return this.spellDamage;}

}
