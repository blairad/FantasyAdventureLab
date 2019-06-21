package MythicalBeastsTests;

import AdventureGame.Characters.Enemies.MythicalBeasts.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;

    @Before

    public void before(){
        ogre = new Ogre("Ogre", 70);
    }

    @Test
    public void BeastHasType(){
        assertEquals("Ogre", ogre.getBeastType());}

    @Test
    public void BeastHasHealthPoint(){
        assertEquals(70, ogre.getBeastHealthPoint());}

}
