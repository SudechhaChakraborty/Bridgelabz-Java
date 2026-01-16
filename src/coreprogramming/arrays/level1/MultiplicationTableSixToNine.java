package core_programming.Arrays.Level1;/*
Create a program to find the multiplication table of a number entered by the user from 6 to 9
and display the result
Hint =>
Take integer input and store it in the variable number as well as define an integer array
to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
*/

import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int[] multiplicationResult = new int[4]; // for 6,7,8,9

        System.out.print("Enter a number: ");
        number = input.nextInt();

        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}
