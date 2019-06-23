package FighterTests;

import AdventureGame.Players.Fighter.Barbarian;
import AdventureGame.Enums.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Clive", 100, 10,5, Weapons.MACE);
    }

    @Test
    public void playerHasAName(){
        assertEquals("Clive", barbarian.getName());
    }

    @Test
    public void playerHasAHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void playerDefendAttack() {assertEquals(5, barbarian.attackDefended());}

    @Test
    public void playerCanGetWeapon(){
        assertEquals(Weapons.MACE, barbarian.getWeapon());
    }

    @Test
    public void canGetWeaponDamage(){assertEquals(15, barbarian.weaponDamage());}
}
