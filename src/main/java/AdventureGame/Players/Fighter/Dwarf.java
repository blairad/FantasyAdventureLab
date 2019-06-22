package AdventureGame.Players.Fighter;

public class Dwarf extends Fighter {

    public Dwarf(String name, int healthPoints, int damagePoints, int defendAttack) {
        super(name, healthPoints, damagePoints, defendAttack);
    }

    public int defendAttack(int attackDefended){
        return attackDefended;
    }

}
