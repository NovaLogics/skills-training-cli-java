package src;

import java.util.Random;
import java.util.Scanner;

public class DiceRollGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number to win (between 1 and 6):");
        int numberToWin = scanner.nextInt();

        if (numberToWin < 1 || numberToWin > 6) {
            System.out.println("Invalid number! Please enter a number between 1 and 6.");
        } 
        else {
            int diceRoll = random.nextInt(6) + 1;
            System.out.println("You rolled: " + diceRoll);

            if (diceRoll == numberToWin) {
                System.out.println("Congratulations! You win!");
            } 
            else {
                System.out.println("Sorry! Better luck next time.");
            }
        }

        scanner.close();
    }
}