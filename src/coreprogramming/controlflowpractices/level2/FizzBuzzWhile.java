package core_programming.ControlFlowPractices.Level2;/*
Rewrite the program 4 ControlFlowPractices.Level2.FizzBuzz using the while loop
 */

import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        if (number > 0) {

            int i = 1;
            while (i <= number) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("ControlFlowPractices.Level2.FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                i++;
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
