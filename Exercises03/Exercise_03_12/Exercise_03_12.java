package Exercises03.Exercise_03_12;

/**
 * (Palindrome integer) Write a program that prompts the user to enter a three-digit integer and determines
 * whether it is a palindrome integer. An integer is palindrome if it reads the same from right to left and 
 * from left to right. A negative integer is treated the same as a positive integer.
 */

import java.util.Scanner;

public class Exercise_03_12 {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for 3-digit integer
        System.out.println("Enter a three-digit integer: ");
        int integer = input.nextInt();

        // Evaluate each digit
        int digitOne = (int)(integer / 100);
        int remainingAmount = integer % 100;
        int digitTwo = (int)(remainingAmount / 10);
        remainingAmount %= 10;
        int digitThree = (int)(remainingAmount);

        // Check if palindrome
        if (digitOne == digitThree)
            System.out.println(integer + " is a palindrome");
        else
            System.out.println(integer + " is not a palindrome");
            
        /** Could also type as:
         * 
         * System.out.println(number + ((digitOne == digitThree) ? " is a " : 
         *  " is not a ") + "palindrome");
         */    
    }
}