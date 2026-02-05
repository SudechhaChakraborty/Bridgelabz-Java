package javaregexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    public String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate);
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
}

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("04-02-2026", formatter.formatDate("2026-02-04"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(IllegalArgumentException.class,
                () -> formatter.formatDate("04/02/2026"));
    }
}