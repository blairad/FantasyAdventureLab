package MageTests;

import AdventureGame.Players.Mages.Sorcerer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SorcererTest {

    Sorcerer sorcerer;

    @Before

    public void before(){
        sorcerer = new Sorcerer("Ron", 100, 3, 20);
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
        assertEquals(20, sorcerer.spellDamage);
    }

}
