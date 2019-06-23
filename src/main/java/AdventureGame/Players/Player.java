package AdventureGame.Players;

public abstract class Player {
    protected String name;
    protected int healthPoints;
    protected int weaponDamage;
    protected int attackDefended;

    public Player(String name, int healthPoints, int attackDefended){
        this.name = name;
        this.healthPoints = healthPoints;
        this.weaponDamage = weaponDamage;
        this.attackDefended = attackDefended;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public int getWeaponDamage(){return this.weaponDamage;}

    public int attackDefended(){return this.attackDefended;}





}
