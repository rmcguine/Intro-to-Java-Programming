package Exercises03.Exercise_03_01;

/*
Write a program that prompts the user to enter values for a, b, and c and displays 
the result based on the discriminant. If the discriminant is positive, display two roots. 
If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots.”
*/

import java.util.Scanner;

public class Exercise_03_01 {
    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter values a, b, and c
        System.out.println("Enter three values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Evaluate the discriminant
        double discriminant = ((b * b) - 4 * (a * c)); // could also do Math.pow(b, 2) - 4 * a * c;

        // Find out if discriminant is pos, negative, or 0, and calculate
        if (discriminant > 0){
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        }
        else if (discriminant == 0){
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has one root: " + r1);
        }
        else {
            System.out.println("The equation has no real roots.");
        }        
       
    }
}
