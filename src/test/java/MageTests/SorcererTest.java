package MageTests;

import AdventureGame.Players.Mages.Sorcerer;
import AdventureGame.Enums.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SorcererTest {

    Sorcerer sorcerer;

    @Before

    public void before(){
        sorcerer = new Sorcerer("Ron", 100, 3, 2, Spells.FIREBALL);
    }

    @Test
    public void mageHasAName(){
        assertEquals("Ron", sorcerer.getName());
    }

    @Test
    public void mageHasAHealthPoints(){
        assertEquals(100, sorcerer.getHealthPoints());
    }

    @Test
    public void mageHasAHealthAbilityLevel(){
        assertEquals(3, sorcerer.getAbilityValue());
    }

    @Test
    public void canDamage(){
        assertEquals(25,  Spells.FIREBALL.spellDamageValue());
    }

    @Test
    public void canDefendAttack(){
        assertEquals(2, sorcerer.defendAttack);
    }
    @Test
    public void canGetSpellType(){
        assertEquals(Spells.FIREBALL, sorcerer.getSpellType());
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(Spells.FIREBALL.spellDamageValue(), sorcerer.getSpellType().spellDamageValue());
    }

}
