import AdventureGame.Players.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;

            @Before
    public void before(){
        barbarian = new Barbarian("Clive", 100);
    }

    @Test
    public void playerHasAName(){
        assertEquals("Clive", barbarian.getName());
    }

    @Test
    public void playerHasAHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }
}