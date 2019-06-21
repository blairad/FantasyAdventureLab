package AdventureGame.Players.Clerics;

public class Cleric {
    String name;
    int healthPoints;

    public Cleric(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

}
