package src;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        
        System.out.println("Welcome to the Math Quiz!");
        System.out.println("_________________________");

        for (int i = 0; i < 5; i++) { // 5 questions
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            char operator = random.nextBoolean() ? '+' : '-';

            System.out.println("\n[Q:"+(i+1) + "]");
            System.out.println("Solve: " + num1 + " " + operator + " " + num2);
            
            int answer = (operator == '+') ? (num1 + num2) : (num1 - num2);
            int playerAnswer = scanner.nextInt();

            if (playerAnswer == answer) {
                System.out.println("> Correct!");
                score++;
            } else {
                System.out.println(">< Incorrect. The correct answer was " + answer);
            }
        }

        System.out.println("\nYou got " + score + " out of 5 correct!");
        scanner.close();
    }
}

