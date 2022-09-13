package Exercises03.Exercise_03_14;

/**
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of a coin 
 * results in heads or tails. The program randomly generates an integer 0 or 1, which represents 
 * head or tail. The program prompts the user to enter a guess, and reports whether the guess 
 * is correct or incorrect.
 */

import java.util.Scanner;

public class Exercise_03_14 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter guess (Head [0] or Tails [1])
        System.out.println("Enter '1' or '0': ");
        int userAnswer = input.nextInt();

        // Generate a random '0' or '1'
        int headsOrTails = (int)(Math.random() * 2);

        // Display results
        if (userAnswer == headsOrTails)
            System.out.println("You win!");
        else
            System.out.println("You lose!");
            
        /**
         * Could also do something like:
         * System.out.println((userAnswer == headsOrTails) ? "Winner!" : "Loser!");
         */                        
    }
}