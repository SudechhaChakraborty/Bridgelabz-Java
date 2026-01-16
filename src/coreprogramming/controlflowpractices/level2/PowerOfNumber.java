package core_programming.ControlFlowPractices.Level2;/*
Create a program to find the power of a number.
Hint =>
Get integer input for two variables - number and power and check for positive integer
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
*/

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int power;
        int result = 1;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        System.out.print("Enter the power: ");
        power = input.nextInt();

        if (number > 0 && power >= 0) {

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println(
                    number + " raised to the power " + power + " is " + result
            );

        } else {
            System.out.println("Please enter positive values.");
        }
    }
}
