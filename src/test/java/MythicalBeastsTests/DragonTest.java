package MythicalBeastsTests;

import AdventureGame.Characters.Enemies.Enemy;
import AdventureGame.Characters.Enemies.MythicalBeasts.Dragon;
import AdventureGame.Characters.Enemies.Troll;
import AdventureGame.Enums.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Troll troll;

    @Before

    public void before(){
        troll = new Troll (30, "Troll", Weapons.CLUB);
        dragon = new Dragon("Dragon", 150, Weapons.BREATHS_FIRE);
    }


    @Test
    public void BeastHasType(){
        assertEquals("Dragon", dragon.getBeastType());}

    @Test
    public void BeastHasHealthPoint(){
        assertEquals(150, dragon.getBeastHealthPoint());}

    @Test
    public void beastCanAttack(){
        assertEquals(Weapons.BREATHS_FIRE, dragon.getWeapon());
    }

    @Test

    public void canGetWeaponDamage(){assertEquals(Weapons.BREATHS_FIRE.getDamage(), dragon.getWeapon().getDamage());
    }

    @Test
    public void canTakeDamage()
    {
        dragon.calculateHealthAfterDamage(15);
        assertEquals(135, dragon.currentHealthPoints());
    }
}
