import AdventureGame.Characters.Enemies.MythicalBeasts.Centaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CentaurTest {
    Centaur centaur;

    @Before

    public void before(){
        centaur = new Centaur("Centaur", 100);
    }

    @Test
    public void BeastHasType(){
        assertEquals("Centaur", centaur.getBeastType());}

    @Test
    public void BeastHasHealthPoint(){
        assertEquals(100, centaur.getBeastHealthPoint());}

}
