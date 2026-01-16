package core_programming.ControlFlowPractices.Level1;/*
Rewrite program 14 using for loop
Hint =>
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result.
*/

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int factorial = 1;

        System.out.print("Enter a natural number: ");
        number = input.nextInt();

        if (number >= 0) {

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println(
                    "The factorial of " + number + " is " + factorial
            );

        } else {
            System.out.println(
                    "Please enter a natural number."
            );
        }
    }
}
