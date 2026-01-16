package core_programming.ControlFlowPractices.Level1;/*
Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct.
Hint =>
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result
*/

import java.util.Scanner;

public class SumOfNaturalNumbersCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int sumByLoop = 0;
        int sumByFormula;

        System.out.print("Enter a natural number: ");
        n = input.nextInt();

        if (n > 0) {

            int i = 1;
            while (i <= n) {
                sumByLoop = sumByLoop + i;
                i++;
            }

            sumByFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + sumByLoop);
            System.out.println("Sum using formula = " + sumByFormula);

            if (sumByLoop == sumByFormula) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("The results are not equal.");
            }

        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
