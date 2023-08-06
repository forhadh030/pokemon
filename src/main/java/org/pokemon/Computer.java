package org.pokemon;

import java.util.HashMap;
import java.util.TreeMap;

public class Computer extends pokemonBuilder {
    private final TreeMap<String, PokemonStats> computerPokemon = new TreeMap<>();

    public Computer() {
        initializeComputerPokemon();
    }

    private void initializeComputerPokemon() {
        // Computer pokemon and their stats are set
        try {
            Thread.sleep(1000);
            pikachuStats();
            charmanderStats();
            squirtleStats();
            bulbasaurStats();
        } catch (InterruptedException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // They are then added to the HashMap
        computerPokemon.put("Pikachu", new PokemonStats(getHP(), getAtkDmg(), getDef(), getSpeed()));
        computerPokemon.put("Charmander", new PokemonStats(getHP(), getAtkDmg(), getDef(), getSpeed()));
        computerPokemon.put("Squirtle", new PokemonStats(getHP(), getAtkDmg(), getDef(), getSpeed()));
        computerPokemon.put("Bulbasaur", new PokemonStats(getHP(), getAtkDmg(), getDef(), getSpeed()));
    }

    public void displayComputerPokemon() {
        System.out.println("Computer's Pokémon:");
        for (String pokemonName : computerPokemon.keySet()) {
            PokemonStats stats = computerPokemon.get(pokemonName);
            System.out.println(pokemonName + " Stats:");
            System.out.println("HP: " + stats.getHP());
            System.out.println("ATK: " + stats.getAtkDmg());
            System.out.println("DEF: " + stats.getDef());
            System.out.println("SPEED: " + stats.getSpeed());
            System.out.println("TOTAL STATS: " + (stats.getHP() + stats.getAtkDmg() + stats.getDef() + stats.getSpeed()) / 4);
            System.out.println("------------");
        }
    }
}
