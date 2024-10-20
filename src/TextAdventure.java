package src;

import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("You are in a dark room.");
        System.out.println("You see two doors.");
        System.out.println("Do you go through door 1 or door 2?");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You entered a room full of treasure! You win!");

        } else if (choice == 2) {
            System.out.println("You were eaten by a grue. Game over.");

        } else {
            System.out.println("Invalid choice. Please select door 1 or door 2.");

        }

        scanner.close();
    }
}
