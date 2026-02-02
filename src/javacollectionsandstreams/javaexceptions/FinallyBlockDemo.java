package javacollectionsandstreams.javaexceptions;

import java.util.Scanner;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        } finally {
            System.out.println("Operation completed");
        }
    }
}