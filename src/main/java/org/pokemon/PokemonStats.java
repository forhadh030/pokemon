package org.pokemon;

public class PokemonStats {
    private final int HP;
    private final int atkDmg;
    private final int def;
    private final int speed;

    public PokemonStats(int HP, int atkDmg, int def, int speed) {
        this.HP = HP;
        this.atkDmg = atkDmg;
        this.def = def;
        this.speed = speed;
    }

    public int getHP() {
        return HP;
    }

    public int getAtkDmg() {
        return atkDmg;
    }

    public int getDef() {
        return def;
    }

    public int getSpeed() {
        return speed;
    }
}