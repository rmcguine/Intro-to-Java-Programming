package Exercises03.Exercise_03_11;

import java.util.Calendar;

/**
* (Find the number of days in a month) Write a program that prompts the user to enter the month
and year and displays the number of days in the month. For example, if the user entered month 2 and year 2012, 
the program should display that February 2012 has 29 days. If the user entered month 3 and year 2015, the program 
should display that March 2015 has 31 days.
*/

import java.util.Scanner;

public class Exercise_03_11 {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the month and year
        System.out.println("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        // Check for a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Check if date is in a future year
        boolean isInFuture = (Calendar.getInstance().get(Calendar.YEAR) < year);

        // Display the number of days in the month
        switch (month) {
            case 1: System.out.println("January " + year + ((isInFuture) ? " will have 31 days" : " had 31 days")); break;
            case 2: System.out.println("February " + year + ((isInFuture) ? " will have" : " had") 
                + ((isLeapYear) ? " 29 days" : " 28 days")); break;
            case 3: System.out.println("March " + year + ((isInFuture) ? " will have 31 days" : " had 31 days")); break;
            case 4: System.out.println("April " + year + ((isInFuture) ? " will have 30 days" : " had 30 days")); break;
            case 5: System.out.println("May " + year + ((isInFuture) ? " will have 31 days" : " had 31 days")); break;
            case 6: System.out.println("June " + year + ((isInFuture) ? " will have 30 days" : " had 30 days")); break;
            case 7: System.out.println("July " + year + ((isInFuture) ? " will have 31 days" : " had 31 days")); break;
            case 8: System.out.println("August " + year + ((isInFuture) ? " will have 31 days" : " had 31 days")); break;
            case 9: System.out.println("September " + year + ((isInFuture) ? " will have 30 days" : " had 30 days")); break;
            case 10: System.out.println("October " + year + ((isInFuture) ? " will have 31 days" : " had 31 days")); break;
            case 11: System.out.println("November " + year + ((isInFuture) ? " will have 30 days" : " had 30 days")); break;
            case 12: System.out.println("December " + year + ((isInFuture) ? " will have 31 days" : " had 31 days")); break;
        }
    }
}