package EnemyTests;

import AdventureGame.Characters.Enemies.Troll;
import AdventureGame.Enums.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Troll troll;

    @Before

    public void before(){
        troll = new Troll(10, "Troll", Weapons.MACE);
    }

    @Test
    public void EnemyHasAName(){
        assertEquals("Troll", troll.getEnemyType());
    }

    @Test
    public void mageHasAHealthPoints(){
        assertEquals(10, troll.getHealthPoints());
    }
    @Test
    public void canAttack(){
        assertEquals( Weapons.MACE.getDamage(), troll.getWeapon().getDamage());
    }


}
