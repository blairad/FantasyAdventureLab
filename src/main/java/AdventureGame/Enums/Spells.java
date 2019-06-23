package AdventureGame.Enums;

public enum Spells {

    FIREBALL(25),
    LIGHTENING_STRIKE(30),
    ICE_STRIKE(20);

    private final int damage;

    Spells(int damage) {this.damage = damage;}

    public int spellDamageValue() {return this.damage;}
}
