package core_programming.ControlFlowPractices.Level1;/*
Create a program to find the bonus of employees based on their years of service.
Hint =>
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary;
        int yearsOfService;
        double bonus;

        System.out.print("Enter salary: ");
        salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
            System.out.println(
                    "The bonus amount is INR " + bonus
            );
        } else {
            System.out.println(
                    "No bonus is applicable."
            );
        }
    }
}

