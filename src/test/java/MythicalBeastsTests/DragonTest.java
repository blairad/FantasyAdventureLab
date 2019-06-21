package MythicalBeastsTests;

import AdventureGame.Characters.Enemies.MythicalBeasts.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before

    public void before(){
        dragon = new Dragon("Dragon", 150);
    }

    @Test
    public void BeastHasType(){
        assertEquals("Dragon", dragon.getBeastType());}

    @Test
    public void BeastHasHealthPoint(){
        assertEquals(150, dragon.getBeastHealthPoint());}
}
