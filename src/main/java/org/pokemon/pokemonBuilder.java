package org.pokemon;

import java.util.*;

public class pokemonBuilder implements mechanism {
    private final TreeMap<String, PokemonStats> pokemon = new TreeMap<>();
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
        System.out.println("\n1 - Pikachu");
        System.out.println("2 - Charmander");
        System.out.println("3 - Squirtle");
        System.out.println("4 - Bulbasaur");
        System.out.println("5 - Go Back");
        int pokemonName = scanner.nextInt();

        try {
            switch (pokemonName) {
                case 1 -> {
                    if (!pokemon.containsKey("Pikachu")) {
                        pikachuStats();
                    } else {
                        System.out.println("\nYou Already Have This Pokemon Doofus!\n");
                    }
                }
                case 2 -> {
                    if (!pokemon.containsKey("Charmander")) {
                        charmanderStats();
                    } else {
                        System.out.println("\nYou Already Have This Pokemon Doofus!\n");
                    }
                }
                case 3 -> {
                    if (!pokemon.containsKey("Squirtle")) {
                        squirtleStats();
                    } else {
                        System.out.println("\nYou Already Have This Pokemon Doofus!\n");
                    }
                }
                case 4 -> {
                    if (!pokemon.containsKey("Bulbasaur")) {
                        bulbasaurStats();
                    } else {
                        System.out.println("\nYou Already Have This Pokemon Doofus!\n");
                    }
                }
                case 5 -> scanner.nextLine();
                default -> System.out.println("Invalid option. Learn to read please.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Looks like you need a reading course. Try again Doofus.");
        }
    }

    @Override
    public void removePokemon() {

    }

    @Override
    public void pikachuStats() {
        try {
            setHP((int) (180 + Math.random() * (274 - 180 + 1)));
            setAtkDmg((int) (103 + Math.random() * (229 - 103 + 1)));
            setDef((int) (76 + Math.random() * (196 - 76 + 1)));
            setSpeed((int) (166 + Math.random() * (306 - 166 + 1)));

            PokemonStats stats = new PokemonStats(HP, atkDmg, def, speed);

            pokemon.put("Pikachu", stats);
            System.out.println();
            displayPokemon();
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    @Override
    public void charmanderStats() {
        try {
            setHP((int) (188 + Math.random() * (282 - 188 + 1)));
            setAtkDmg((int) (98 + Math.random() * (223 - 98 + 1)));
            setDef((int) (81 + Math.random() * (203 - 81 + 1)));
            setSpeed((int) (121 + Math.random() * (251 - 121 + 1)));

            PokemonStats stats = new PokemonStats(HP, atkDmg, def, speed);

            pokemon.put("Charmander", stats);
            System.out.println();
            displayPokemon();
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @Override
    public void squirtleStats() {
        try {
            setHP((int) (198 + Math.random() * (292 - 198 + 1)));
            setAtkDmg((int) (90 + Math.random() * (214 - 90 + 1)));
            setDef((int) (121 + Math.random() * (251 - 121 + 1)));
            setSpeed((int) (81 + Math.random() * (203 - 81 + 1)));

            PokemonStats stats = new PokemonStats(HP, atkDmg, def, speed);

            pokemon.put("Squirtle", stats);
            System.out.println();
            displayPokemon();
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    @Override
    public void bulbasaurStats() {
        try {
            setHP((int) (200 + Math.random() * (294 - 200 + 1)));
            setAtkDmg((int) (92 + Math.random() * (216 - 92 + 1)));
            setDef((int) (92 + Math.random() * (216 - 92 + 1)));
            setSpeed((int) (85 + Math.random() * (207 - 85 + 1)));

            PokemonStats stats = new PokemonStats(HP, atkDmg, def, speed);

            pokemon.put("Bulbasaur", stats);
            System.out.println();
            displayPokemon();
            System.out.println();
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
            System.out.println("TOTAL STATS: " +
                    (stats.getHP() + stats.getAtkDmg() + stats.getDef() + stats.getSpeed()) / 4);
            System.out.println("------------");
        }
    }
}
