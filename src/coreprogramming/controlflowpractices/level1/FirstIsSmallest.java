package core_programming.ControlFlowPractices.Level1;/*
Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ___
*/

import java.util.Scanner;

public class FirstIsSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println(
                    "Is the first number the smallest? Yes"
            );
        } else {
            System.out.println(
                    "Is the first number the smallest? No"
            );
        }
    }
}
