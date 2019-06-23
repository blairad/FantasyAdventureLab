package FighterTests;

import AdventureGame.Players.Fighter.Dwarf;
import AdventureGame.Enums.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before

    public void before(){
        dwarf = new Dwarf("Clarence", 100, 15,5, Weapons.AXE);
    }

    @Test
    public void playerHasAName(){
        assertEquals("Clarence", dwarf.getName());
    }

    @Test
    public void playerHasAHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }

   @Test
    public void playerDefendAttack() {assertEquals(5, dwarf.attackDefended());}

    @Test
    public void playerCanGetWeapon(){
        assertEquals(Weapons.AXE, dwarf.getWeapon());
    }

    @Test
    public void canGetWeaponDamage(){assertEquals(Weapons.AXE.getDamage(), dwarf.getWeapon().getDamage());
    }
}
