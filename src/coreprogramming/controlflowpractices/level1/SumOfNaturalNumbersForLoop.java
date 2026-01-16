package core_programming.ControlFlowPractices.Level1;/*
Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.
Hint =>
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
*/

import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int sumByLoop = 0;
        int sumByFormula;

        System.out.print("Enter a natural number: ");
        n = input.nextInt();

        if (n > 0) {

            for (int i = 1; i <= n; i++) {
                sumByLoop = sumByLoop + i;
            }

            sumByFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop = " + sumByLoop);
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
