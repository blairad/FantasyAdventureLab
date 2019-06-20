import AdventureGame.Players.Mages.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;

    @Before

    public void before(){
        warlock = new Warlock("Wilson", 100, 5);
    }

    @Test
    public void mageHasAName(){
        assertEquals("Wilson", warlock.getName());
    }

    @Test
    public void mageHasAHealthPoints(){
        assertEquals(100, warlock.getHealthPoints());
    }

    @Test
    public void mageHasAHealthAbilityLevel(){
        assertEquals(5, warlock.getAbilityValue());
    }
}
