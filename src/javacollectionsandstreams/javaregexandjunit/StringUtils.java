package javaregexandjunit;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtils {

    // Reverse a string
    public String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    // Check if string is palindrome
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Convert string to uppercase
    public String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}

/*
 * JUnit Test Class
 * (NOT public – important!)
 */
class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    void testPalindromeTrue() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }

    @Test
    void testNullString() {
        assertNull(utils.reverse(null));
        assertNull(utils.toUpperCase(null));
        assertFalse(utils.isPalindrome(null));
    }
}