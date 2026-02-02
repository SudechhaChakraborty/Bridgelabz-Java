package javacollectionsandstreams.javaexceptions;

import java.io.*;

public class CheckedUncheckedDemo {

    static void processData(boolean checked, boolean unchecked)
            throws IOException {

        if (checked) {
            throw new IOException("Checked exception occurred");
        }

        if (unchecked) {
            throw new RuntimeException("Unchecked exception occurred");
        }

        System.out.println("Data processed successfully");
    }

    public static void main(String[] args) {
        try {
            processData(true, false);
        } catch (IOException e) {
            System.out.println("Handled checked exception");
        } catch (RuntimeException e) {
            System.out.println("Handled unchecked exception");
        }
    }
}
