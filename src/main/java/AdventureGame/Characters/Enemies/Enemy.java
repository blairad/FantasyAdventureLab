package AdventureGame.Characters.Enemies;

import AdventureGame.Interfaces.IWeapon;

public abstract class Enemy implements IWeapon {
    int healthPoints;
    String enemyType;

    public Enemy(int healthPoints, String enemyType){
        this.healthPoints = healthPoints;
        this.enemyType = enemyType;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public String getEnemyType(){
        return this.enemyType;
    }


}
