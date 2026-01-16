package core_programming.ControlFlowPractices.Level1;/*
Write a Program to find the factorial of an integer entered by the user.
Hint =>
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
*/

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int factorial = 1;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        if (number >= 0) {

            int i = 1;
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            System.out.println(
                    "The factorial of " + number + " is " + factorial
            );

        } else {
            System.out.println(
                    "Please enter a positive integer."
            );
        }
    }
}
