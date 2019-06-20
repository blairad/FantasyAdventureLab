import AdventureGame.Players.Mages.Warlock;
import AdventureGame.Players.Mages.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before

    public void before(){
        wizard = new Wizard("Stanley", 100, 6);
    }

    @Test
    public void mageHasAName(){
        assertEquals("Stanley", wizard.getName());
    }

    @Test
    public void mageHasAHealthPoints(){
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void mageHasAHealthAbilityLevel(){
        assertEquals(6, wizard.getAbilityValue());
    }
}
