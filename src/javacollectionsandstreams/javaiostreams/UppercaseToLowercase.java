package javacollectionsandstreams.javaiostreams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String source = sc.nextLine();

        System.out.print("Enter destination file name: ");
        String dest = sc.nextLine();

        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(source, StandardCharsets.UTF_8));
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(dest, StandardCharsets.UTF_8))
        ) {
            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }
            System.out.println("Conversion completed successfully!");

        } catch (IOException e) {
            System.out.println("File processing error.");
        }
    }
}