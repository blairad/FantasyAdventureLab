package AdventureGame.Players.Mages;

import AdventureGame.Interfaces.ISpell;

public class Sorcerer extends Mage implements ISpell {
    public Sorcerer(String name, int healthPoints, int abilityValue, int spellDamage) {
        super(name, healthPoints, abilityValue, spellDamage);

    }
    public void spellDamage(int damage){
        spellDamage += damage;
    }




}
