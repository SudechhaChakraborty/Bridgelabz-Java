package javaregexandjunit;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }

    public String readFromFile(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }
        return sb.toString();
    }
}

class FileProcessorTest {

    @Test
    void testWriteAndReadFile() throws IOException {
        FileProcessor fp = new FileProcessor();
        String file = "test.txt";

        fp.writeToFile(file, "Hello JUnit");
        assertTrue(new File(file).exists());

        String content = fp.readFromFile(file);
        assertEquals("Hello JUnit", content);

        new File(file).delete(); // cleanup
    }

    @Test
    void testReadFileNotFound() {
        FileProcessor fp = new FileProcessor();

        assertThrows(IOException.class,
                () -> fp.readFromFile("nofile.txt"));
    }
}
