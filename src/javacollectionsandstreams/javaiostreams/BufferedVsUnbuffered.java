package javacollectionsandstreams.javaiostreams;

import java.io.*;
import java.util.Scanner;

public class BufferedVsUnbuffered {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String source = sc.nextLine();

        System.out.print("Enter destination file: ");
        String dest = sc.nextLine();

        // Unbuffered
        long start = System.nanoTime();
        copyUnbuffered(source, dest);
        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start) + " ns");

        // Buffered
        start = System.nanoTime();
        copyBuffered(source, "buffered_" + dest);
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start) + " ns");
    }

    static void copyUnbuffered(String src, String dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    static void copyBuffered(String src, String dest) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }
}