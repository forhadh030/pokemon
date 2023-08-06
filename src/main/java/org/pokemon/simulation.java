package org.pokemon;

import java.util.Scanner;

public class simulation {
    public static void main(String[] args) {
        simulate();
    }

    public static void simulate() {
        Scanner scanner = new Scanner(System.in);
        pokemonBuilder pokemon = new pokemonBuilder();
        Computer computer = new Computer();
        int choice;

        do {
            try {
                System.out.println("What do you want to do? ");
                System.out.println("1 - Add a Pokemon");
                System.out.println("2 - Display a Pokemon");
                System.out.println("3 - Display Computer Pokemon");
                System.out.println("4 - Remove a Pokemon (under construction)");
                System.out.println("5 - Quit");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1 -> pokemon.addPokemon();
                    case 2 -> pokemon.displayPokemon();
                    case 3 -> computer.displayComputerPokemon();
                    case 4 -> System.out.println("UNDER CONSTRUCTION");
                    case 5 -> System.out.println("Goodbye.");
                    default -> System.out.println("Invalid option. Learn to read please.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nLooks like you need a reading course. Try again Doofus.");
                scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
                choice = -1; // Set an invalid value for choice to continue the loop
            }
        } while (choice != 5);
        scanner.close();
    }
}
