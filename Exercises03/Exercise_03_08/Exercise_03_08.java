package Exercises03.Exercise_03_08;

/**
 * (Sort three integers) Write a program that prompts the user to enter three integers 
 * and display the integers in non-decreasing order.
 */

import java.util.Scanner;

public class Exercise_03_08 {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three digits
        System.out.println("Enter three integers: ");
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        int thirdInt = input.nextInt();

        // Check order of integers for non-decreasing order
        int temp;
        if (secondInt <= firstInt || thirdInt <= firstInt) {
            if (secondInt <= firstInt) {
                temp = firstInt;
                firstInt = secondInt;
                secondInt = temp;
            }
            if (thirdInt <= firstInt) {
                temp = firstInt;
                firstInt = thirdInt;
                thirdInt = temp;
            }
        }
        if (thirdInt <= secondInt) {
            temp = secondInt;
            secondInt = thirdInt;
            thirdInt = temp;
        }
        
        // Display numbers
        System.out.println(firstInt + " " + secondInt + " " + thirdInt);


        
    }

}