package javacollectionsandstreams.javaiostreams;

import java.io.*;
import java.util.Scanner;

public class ImageToByteArray {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source image path: ");
        String source = sc.nextLine();

        System.out.print("Enter destination image path: ");
        String dest = sc.nextLine();

        FileInputStream fis = new FileInputStream(source);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }

        byte[] imageBytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream(dest);

        while ((bytesRead = bais.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        System.out.println("Image copied successfully!");

        fis.close();
        fos.close();
    }
}