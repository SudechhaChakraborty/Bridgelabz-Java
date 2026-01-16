package core_programming.ControlFlowPractices.Level1;/*
Rewrite program 8 to do the countdown using the for-loop
*/

import java.util.Scanner;

public class RocketLaunchCountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter;

        System.out.print("Enter countdown start number: ");
        counter = input.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("🚀 Rocket Launched!");
    }
}
