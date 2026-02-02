package javacollectionsandstreams.javaiostreams;

import java.io.*;
import java.util.Scanner;

public class StudentDataStream {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        // Write data
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream("student.dat"))) {

            dos.writeInt(roll);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data stored successfully!");

        } catch (IOException e) {
            System.out.println("Error writing data.");
        }

        // Read data
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream("student.dat"))) {

            int r = dis.readInt();
            String n = dis.readUTF();
            double g = dis.readDouble();

            System.out.println("\nRetrieved Data:");
            System.out.println("Roll: " + r);
            System.out.println("Name: " + n);
            System.out.println("GPA: " + g);

        } catch (IOException e) {
            System.out.println("Error reading data.");
        }
    }
}