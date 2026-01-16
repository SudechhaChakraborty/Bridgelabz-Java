package core_programming.ControlFlowPractices.Level2;/*
Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint =>
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop.
*/

import java.util.Scanner;

public class MultiplesBelowHundredWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int counter = 100;

        System.out.print("Enter a positive number less than 100: ");
        number = input.nextInt();

        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100 are:");

            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
    }
}
