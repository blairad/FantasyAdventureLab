package AdventureGame.Players.Mages;

import AdventureGame.Enums.Spells;
import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.ISpell;

public class Sorcerer extends Mage implements ISpell, IDefend {

    Spells spell;

    public Sorcerer(String name, int healthPoints, int abilityValue, int defendAttack, Spells spell) {
        super(name, healthPoints, abilityValue, defendAttack);

        this.spell = spell;

    }

    public Spells getSpellType(){return this.spell; }


    public int spellDamage(int damageSpell){
        return this.spell.spellDamageValue();
    }

    public int defendAttack(int defendAttack){
        return attackDefended;
    }





}
