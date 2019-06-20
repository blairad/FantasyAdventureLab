import AdventureGame.Characters.Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Troll troll;

    @Before

    public void before(){
        troll = new Troll(10, "Troll");
    }

    @Test
    public void EnemyHasAName(){
        assertEquals("Troll", troll.getEnemyType());
    }

    @Test
    public void mageHasAHealthPoints(){
        assertEquals(10, troll.getHealthPoints());
    }


}
