package MageTests;

import AdventureGame.Enums.Spells;
import AdventureGame.Players.Mages.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before

    public void before(){
        wizard = new Wizard("Stanley", 100, 6, 2, Spells.ICE_STRIKE);
    }

    @Test
    public void mageHasAName(){
        assertEquals("Stanley", wizard.getName());
    }

    @Test
    public void mageHasAHealthPoints(){
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void mageHasAHealthAbilityLevel(){
        assertEquals(6, wizard.getAbilityValue());
    }

    @Test
    public void canDefendAttack(){
        assertEquals(2, wizard.defendAttack);
    }

    @Test
    public void canGetSpellType(){
        assertEquals(Spells.ICE_STRIKE, wizard.getSpellType());
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(Spells.ICE_STRIKE.spellDamageValue(), wizard.getSpellType().spellDamageValue());
    }
}
