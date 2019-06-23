package AdventureGame.Characters.Enemies.MythicalBeasts;

import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.IWeapon;

public abstract class Beast  {
    String beastType;
    int beastHealthPoint;

    public Beast(String beastType, int beastHealthPoint){
        this.beastType = beastType;
        this.beastHealthPoint = beastHealthPoint;
    }

    public String getBeastType(){
        return  this.beastType;
    }

    public int getBeastHealthPoint(){
        return  this.beastHealthPoint;
    }

    
}
