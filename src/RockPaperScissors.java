package src;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Enter your choice (Rock, Paper, Scissors):");
        String userChoice = scanner.nextLine();
        String computerChoice = options[random.nextInt(options.length)];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");

        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
                   ) {
            System.out.println("You win!");
            
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}

