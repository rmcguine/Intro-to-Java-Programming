package Exercises03.Exercise_03_03;

/* (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using Cramer’s rule 
given in Programming Exercise 1.13. Write a program that prompts the user to enter a, b, c, d, e, 
and f and displays the result. If ad - bc is 0, report that “The equation has no solution.”
*/

import java.util.Scanner;

public class Exercise_03_03 {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter values for a, b, c, d, e, and f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Remove case exception
        if ((a * d) - (b * c) == 0)
            System.out.println("The equation has no solution");
        
        else {    
            // find values for x and y
            double x = (((e * d) - (b * f)) / ((a * d) - (b - c)));           
            double y = (((a * f) - (e * c)) / ((a * d) - (b - c)));

            // Print x and y
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
