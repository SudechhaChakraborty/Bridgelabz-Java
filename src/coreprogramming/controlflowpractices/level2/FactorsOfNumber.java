package core_programming.ControlFlowPractices.Level2;/*
Create a program to find the factors of a number taken as user input.
Hint =>
Get the input value for a variable named number and check if it is a positive integer.
Run a for loop from i = 1 to i < number. In each iteration of the loop,
check if the number is perfectly divisible by i. If true, print the value of i.
 */
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        if (number > 0) {

            System.out.println("Factors of " + number + " are:");

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
