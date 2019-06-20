import AdventureGame.Players.Fighter.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before

    public void before(){
        knight = new Knight("Dave", 100);
    }

    @Test
    public void playerHasAName(){
        assertEquals("Dave", knight.getName());
    }

    @Test
    public void playerHasAHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }
}
