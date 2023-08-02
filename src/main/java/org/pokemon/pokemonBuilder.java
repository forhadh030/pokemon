package org.pokemon;

import java.util.*;

public class pokemonBuilder implements mechanism {
    private HashMap<String, PokemonStats> pokemon = new HashMap<>();
    private int HP;
    private int atkDmg;
    private int def;
    private int speed;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAtkDmg() {
        return atkDmg;
    }

    public void setAtkDmg(int atkDmg) {
        this.atkDmg = atkDmg;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void addPokemon() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the pokemon you want: ");
        System.out.println("\n1 - Charmander");
        System.out.println("2 - Squirtle");
        System.out.println("3 - Bulbasaur");
        int pokemonName = scanner.nextInt();

        switch (pokemonName) {
            case 1 -> charmanderStats();
            case 2 -> squirtleStats();
            case 3 -> bulbasaurStats();
            default -> System.out.println("Invalid input. Please try again.");
        }
    }

    @Override
    public void removePokemon() {

    }

    @Override
    public void charmanderStats() {
        try {
            int HP = (int) (188 + Math.random() * (282 - 188 + 1));
            int atkDmg = (int) (98 + Math.random() * (223 - 98 + 1));
            int def = (int) (81 + Math.random() * (203 - 81 + 1));
            int speed = (int) (121 + Math.random() * (251 - 121 + 1));

            PokemonStats stats = new PokemonStats(HP, atkDmg, def, speed);

            pokemon.put("Charmander", stats);
            System.out.println(pokemon.get("Charmander"));
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @Override
    public void squirtleStats() {
        try {
            int HP = (int) (198 + Math.random() * (292 - 198 + 1));
            int atkDmg = (int) (90 + Math.random() * (214 - 90 + 1));
            int def = (int) (121 + Math.random() * (251 - 121 + 1));
            int speed = (int) (81 + Math.random() * (203 - 81 + 1));

            PokemonStats stats = new PokemonStats(HP, atkDmg, def, speed);

            pokemon.put("Squirtle", stats);
            System.out.println(pokemon.get("Squirtle"));
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @Override
    public void bulbasaurStats() {
        try {
            int HP = (int) (200 + Math.random() * (294 - 200 + 1));
            int atkDmg = (int) (92 + Math.random() * (216 - 92 + 1));
            int def = (int) (92 + Math.random() * (216 - 92 + 1));
            int speed = (int) (85 + Math.random() * (207 - 85 + 1));

            PokemonStats stats = new PokemonStats(HP, atkDmg, def, speed);

            pokemon.put("Bulbasaurs", stats);
            System.out.println(pokemon.get("Bulbasaurs"));
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @Override
    public void displayPokemon() {
        for (Map.Entry<String, PokemonStats> entry : pokemon.entrySet()) {
            String pokemonName = entry.getKey();
            PokemonStats stats = entry.getValue();
            System.out.println(pokemonName + " Stats:");
            System.out.println("HP: " + stats.getHP());
            System.out.println("ATK: " + stats.getAtkDmg());
            System.out.println("DEF: " + stats.getDef());
            System.out.println("SPEED: " + stats.getSpeed());
            // Calculate and display the total stats if needed
            System.out.println("------------");
        }
    }
}
