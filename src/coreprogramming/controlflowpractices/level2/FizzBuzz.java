package core_programming.ControlFlowPractices.Level2;/*
Write a program ControlFlowPractices.Level2.FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "ControlFlowPractices.Level2.FizzBuzz".
Hint =>
Take the user input number, check for a positive integer, and use for loop to display
*/

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("ControlFlowPractices.Level2.FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
