package core_programming.Arrays.Level1;/*
Create a program to find the mean height of players present in a football team.
Hint =>
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
*/

import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;
        double mean;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        mean = sum / heights.length;

        System.out.println("\nMean height of the football team = " + mean);
    }
}
