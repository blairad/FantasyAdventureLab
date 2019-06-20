package AdventureGame.Players;

public abstract class Player {
    String name;
    int healthPoints;
    int weaponDamage;

    public Player(String name, int healthPoints, int weaponDamage){
        this.name = name;
        this.healthPoints = healthPoints;
        this.weaponDamage = weaponDamage;

    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }



    public int getWeaponDamage(){return this.weaponDamage;}




}
