package FighterTests;

import AdventureGame.Players.Fighter.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before

    public void before(){
        dwarf = new Dwarf("Clarence", 100, 15);
    }

    @Test
    public void playerHasAName(){
        assertEquals("Clarence", dwarf.getName());
    }

    @Test
    public void playerHasAHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }
}
