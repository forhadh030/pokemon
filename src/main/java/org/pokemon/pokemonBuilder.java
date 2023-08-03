package org.pokemon;

import org.w3c.dom.ls.LSOutput;

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
        System.out.println("\n1 - Pikachu");
        System.out.println("2 - Charmander");
        System.out.println("3 - Squirtle");
        System.out.println("4 - Bulbasaur");
        System.out.println("5 - Go Back");
        int pokemonName = scanner.nextInt();
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
            default -> System.out.println("Invalid input. Please try again.");
        }
    }

    @Override
    public void removePokemon() {

    }

    @Override
    public void pikachuStats() {
        try {
            int HP = (int) (180 + Math.random() * (274 - 180 + 1));
            int atkDmg = (int) (103 + Math.random() * (229 - 103 + 1));
            int def = (int) (76 + Math.random() * (196 - 76 + 1));
            int speed = (int) (166 + Math.random() * (306 - 166 + 1));

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
            int HP = (int) (188 + Math.random() * (282 - 188 + 1));
            int atkDmg = (int) (98 + Math.random() * (223 - 98 + 1));
            int def = (int) (81 + Math.random() * (203 - 81 + 1));
            int speed = (int) (121 + Math.random() * (251 - 121 + 1));

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
            int HP = (int) (198 + Math.random() * (292 - 198 + 1));
            int atkDmg = (int) (90 + Math.random() * (214 - 90 + 1));
            int def = (int) (121 + Math.random() * (251 - 121 + 1));
            int speed = (int) (81 + Math.random() * (203 - 81 + 1));

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
            int HP = (int) (200 + Math.random() * (294 - 200 + 1));
            int atkDmg = (int) (92 + Math.random() * (216 - 92 + 1));
            int def = (int) (92 + Math.random() * (216 - 92 + 1));
            int speed = (int) (85 + Math.random() * (207 - 85 + 1));

            PokemonStats stats = new PokemonStats(HP, atkDmg, def, speed);

            pokemon.put("Bulbasaurs", stats);
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
            // Calculate and display the total stats if needed
            System.out.println("------------");
        }
    }
}
