package core_programming.ControlFlowPractices.Level2;/*
Rewrite the above program to find the power of a number using a while loop.
Hint =>
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
Finally, print the result
*/

import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int power;
        int result = 1;
        int counter = 0;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        System.out.print("Enter the power: ");
        power = input.nextInt();

        if (number > 0 && power >= 0) {

            while (counter < power) {
                result = result * number;
                counter++;
            }

            System.out.println(
                    number + " raised to the power " + power + " is " + result
            );

        } else {
            System.out.println("Please enter valid positive values.");
        }
    }
}
