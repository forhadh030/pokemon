package org.pokemon;

import java.util.Scanner;

public class simulation {
    public static void main(String[] args) {
        simulate();
    }

    public static void simulate() {
        Scanner scanner = new Scanner(System.in);
        pokemonBuilder charmander = new pokemonBuilder();
        int choice;

        do {
            System.out.println("What do you want to do? ");
            System.out.println("1 - Add a Pokemon");
            System.out.println("2 - Display a Pokemon");
            System.out.println("3 - Remove a Pokemon (under construction)");
            System.out.println("4 - Quit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1 -> charmander.addPokemon();
                case 2 -> charmander.displayPokemon();
                case 3 -> System.out.println("UNDER CONSTRUCTION");
                case 4 -> System.out.println("Goodbye.");
                default -> System.out.println("Invalid option. Learn to read please.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
