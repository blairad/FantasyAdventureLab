package EnemyTests;

import AdventureGame.Characters.Enemies.Orc;
import AdventureGame.Enums.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before

    public void before(){
        orc = new Orc(9, "Orc", Weapons.MACE);
    }

    @Test
    public void EnemyHasAName(){
        assertEquals("Orc", orc.getEnemyType());
    }

    @Test
    public void mageHasAHealthPoints(){
        assertEquals(9, orc.getHealthPoints());
    }



}
