package AdventureGame.Players.Mages;

import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.ISpell;

public class Sorcerer extends Mage implements ISpell, IDefend {
    public Sorcerer(String name, int healthPoints, int abilityValue, int spellDamage, int defendAttack) {
        super(name, healthPoints, abilityValue, spellDamage, defendAttack);

    }
    public void spellDamage(int damage){
        spellDamage += damage;
    }
    public int defendAttack(int damage){
        defendAttack -= damage;
        return damage;
    }





}
