/* The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the user to 
enter the product of these two inte- gers. Revise the program to generate three single-digit integers 
and prompt the user to enter the multiplication of these three integers.
*/

import java.util.Scanner;

public class Exercise_03_02 {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Generate three, single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        // Prompt user for answer
        System.out.println("What is " + number1 + " * " + number2 + " * " + number3 + "?");
        int answer = input.nextInt();

        // Output answer
        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + " is "
        + (number1 * number2 * number3 == answer));

    }
}
