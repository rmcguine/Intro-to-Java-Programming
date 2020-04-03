package Exercises03.Exercise_03_10;

/**
 * (Game: multiplication quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. 
 * Revise the program to randomly generate a multiplication question with two integers less than 1000.
 */

import java.util.Scanner; 

public class Exercise_03_10 {
    public static void main(String[] args) {
        // Generate two random integers less than 1000
        int number1 = (int)(Math.random() * 1000);
        int number2 = (int)(Math.random() * 1000);

        // Prompt the student to answer "What is number1 * number2?"
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " * " + number2 + "? ");
        int answer = input.nextInt();

        // Grade the answer and display the result
        if (number1 * number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " * " + number2 + " should be " + (number1 * number2)); 
        }    
    }
}