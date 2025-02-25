package FighterTests;

import AdventureGame.Players.Fighter.Knight;
import AdventureGame.Enums.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Dave", 100, Weapons.LONG_SWORD,5);
    }

    @Test
    public void playerHasAName(){
        assertEquals("Dave", knight.getName());
    }

    @Test
    public void playerHasAHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void playerDefendAttack() {assertEquals(5, knight.attackDefended());}

    @Test
    public void playerCanGetWeapon(){
        assertEquals(Weapons.LONG_SWORD, knight.getWeapon());
    }

    @Test
    public void canGetWeaponDamage(){assertEquals(Weapons.LONG_SWORD.getDamage(), knight.getWeapon().getDamage());
    }
    @Test
    public void canTakeDamage()
    {
        knight.calculateHealthAfterDamage(15);
        assertEquals(85, knight.currentHealthPoints());
    }
}
