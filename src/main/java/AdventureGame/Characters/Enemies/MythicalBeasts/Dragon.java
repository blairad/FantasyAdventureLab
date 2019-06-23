package AdventureGame.Characters.Enemies.MythicalBeasts;

import AdventureGame.Characters.Enemies.Troll;
import AdventureGame.Enums.Weapons;
import AdventureGame.Interfaces.IDefend;
import AdventureGame.Interfaces.IWeapon;

public class Dragon extends Beast implements IWeapon {

    Weapons weapon;

    public Dragon(String beastType, int beastHealthPoint, Weapons weapon) {
        super(beastType, beastHealthPoint);
        this.weapon = weapon;
    }

    public void Attack(int damageInflicted){
        beastHealthPoint -= damageInflicted;
    }

    public Weapons getWeapon(){
        return this.weapon;
    }

    public int currentHealthPoints(){return beastHealthPoint;}

    public int calculateHealthAfterDamage(int weaponDamage) {
        return this.beastHealthPoint -= weaponDamage;
    }
}
