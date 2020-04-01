package Exercises03.Exercise_03_06;

/**
 * (Health application: BMI) Revise Listing 3.4, 
 * ComputeAndInterpretBMI.java, to let the user 
 * enter weight, feet, and inches. For example, 
 * if a person is 5 feet and 10 inches, you will 
 * enter 5 for feet and 10 for inches. 
 */

import java.util.Scanner;

public class Exercise_03_06 {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter weight in pounds: ");
        double userPounds = input.nextDouble();

        System.out.println("Enter feet: ");
        int userFeet = input.nextInt();
        userFeet *= 12; // Divide feet by 12 to get inches

        System.out.println("Enter inches: ");
        int userInches = input.nextInt();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Compute BMI
        double weightInKilograms = userPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = (userFeet + userInches) * METERS_PER_INCH;
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);
        
        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");




    }
}