package AdventureGame.Characters.Enemies;

public abstract class Enemy {
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
