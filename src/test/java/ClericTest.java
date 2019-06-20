import AdventureGame.Characters.Enemies.MythicalBeasts.Dragon;
import AdventureGame.Players.Clerics.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before

    public void before(){
        cleric = new Cleric("Florence", 100);
    }

    @Test
    public void BeastHasType(){
        assertEquals("Florence", cleric.getName());}

    @Test
    public void BeastHasHealthPoint(){
        assertEquals(100, cleric.getHealthPoints());}

}
