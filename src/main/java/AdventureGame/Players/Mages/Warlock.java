package AdventureGame.Players.Mages;

import AdventureGame.Interfaces.ISpell;

public class Warlock extends Mage implements ISpell{
    public Warlock(String name, int healthPoints, int abilityValue, int spellDamage) {
        super(name, healthPoints, abilityValue, spellDamage);
    }

    public void spellDamage(int damage){
        spellDamage += damage;
    }
}
