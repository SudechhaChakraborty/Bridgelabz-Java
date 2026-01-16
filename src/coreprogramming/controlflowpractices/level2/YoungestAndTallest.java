package core_programming.ControlFlowPractices.Level2;/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
*/

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageAmar, ageAkbar, ageAnthony;
        double heightAmar, heightAkbar, heightAnthony;

        System.out.print("Enter Amar's age: ");
        ageAmar = input.nextInt();

        System.out.print("Enter Amar's height: ");
        heightAmar = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        ageAkbar = input.nextInt();

        System.out.print("Enter Akbar's height: ");
        heightAkbar = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        ageAnthony = input.nextInt();

        System.out.print("Enter Anthony's height: ");
        heightAnthony = input.nextDouble();

        // Find youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest friend.");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest friend.");
        } else {
            System.out.println("Anthony is the youngest friend.");
        }

        // Find tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest friend.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest friend.");
        } else {
            System.out.println("Anthony is the tallest friend.");
        }
    }
}
