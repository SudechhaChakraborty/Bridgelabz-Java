package core_programming.Arrays.Level2;/*

 */

import java.util.Scanner;

public class BMIMultiplePerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPersons;

        System.out.print("Enter number of persons: ");
        numberOfPersons = input.nextInt();

        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];


        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
        }

        for (int i = 0; i < numberOfPersons; i++) {
            double heightInMeter = height[i] / 100;
            bmi[i] = weight[i] / (heightInMeter * heightInMeter);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }


        System.out.println("\n BMI Report ");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " | Height: " + height[i] + " cm" +
                            " | Weight: " + weight[i] + " kg" +
                            " | BMI: " + bmi[i] +
                            " | Status: " + status[i]
            );
        }
    }
}
