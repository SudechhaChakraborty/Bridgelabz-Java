package core_programming.Arrays.Level2;/*
Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint =>
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
*/

import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter number of persons: ");
        number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] > 0)
                    break;
                System.out.println("Invalid weight. Enter a positive value.");
            }

            while (true) {
                System.out.print("Enter height (cm): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] > 0)
                    break;
                System.out.println("Invalid height. Enter a positive value.");
            }
        }

        for (int i = 0; i < number; i++) {

            double heightInMeter = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightInMeter * heightInMeter);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < number; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " | Height: " + personData[i][1] + " cm" +
                            " | Weight: " + personData[i][0] + " kg" +
                            " | BMI: " + personData[i][2] +
                            " | Status: " + weightStatus[i]
            );
        }
    }
}
