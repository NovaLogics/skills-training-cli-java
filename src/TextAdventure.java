package src;

import java.util.Random;
import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Randomly select the winning door (1, 2, or 3)
        int winningDoor = random.nextInt(3) + 1;
        
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("____________________________________");
        
        
        System.out.println("You are in a dark room.");
        System.out.println("You see three doors.");
        System.out.println("____________________________________");
        System.out.println("[door 1] [door 2] [door 3]");
        System.out.println("____________________________________");
        
        // Provide a hint to the player
        int hintDoor = (winningDoor == 1) ? 2 : 1;
        System.out.println(":::: Hint: Door " + hintDoor + " seems unsafe ::::");
        

        System.out.println("Do you go through \ndoor 1, door 2, or door 3?");

        int choice = scanner.nextInt();

        if (choice == winningDoor) {
            System.out.println("You entered a room full of treasure!");
            System.out.println("=>>> You Win! <<<=");

        } else if (choice == 1 || choice == 2 || choice == 3) {
            System.out.println("You were eaten by a grue.");
              System.out.println("==== Game Over ====");

        } else {
            System.out.println("Invalid choice. Please select door 1, 2, or 3.");

        }

        scanner.close();
    }
}
