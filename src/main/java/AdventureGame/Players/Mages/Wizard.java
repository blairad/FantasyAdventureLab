package AdventureGame.Players.Mages;

import AdventureGame.Interfaces.ISpell;

public class Wizard extends Mage implements ISpell {
    public Wizard(String name, int healthPoints, int abilityValue, int spellDamage, int defendAttack) {
        super(name, healthPoints, abilityValue, spellDamage, defendAttack);
    }

    public void spellDamage(int damage){
        spellDamage += damage;
    }
    public void defendAttack(int damage){
        defendAttack -= damage;
    }

}
