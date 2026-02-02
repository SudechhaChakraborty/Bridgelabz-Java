package javacollectionsandstreams.javaexceptions;

import java.io.*;
import java.util.*;

public class FileProcessor {

    public void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            System.out.println("\nReading file: " + path);

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + path);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> files = new ArrayList<>();

        System.out.print("Enter number of files: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter file path: ");
            files.add(sc.nextLine());
        }

        new FileProcessor().processFiles(files);
    }
}