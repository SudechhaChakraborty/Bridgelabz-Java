package core_programming.ControlFlowPractices.Level1;/*
Write a program to find the sum of numbers until the user enters 0
Hint =>
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value
*/


import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();

        while (number != 0) {
            total = total + number;

            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }

        System.out.println("The total sum is " + total);
    }
}
