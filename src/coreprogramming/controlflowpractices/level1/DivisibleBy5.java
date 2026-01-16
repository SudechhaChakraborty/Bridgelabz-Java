package core_programming.ControlFlowPractices.Level1;/*
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/

import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println(
                    "Is the number " + number + " divisible by 5? Yes"
            );
        } else {
            System.out.println(
                    "Is the number " + number + " divisible by 5? No"
            );
        }
    }
}
