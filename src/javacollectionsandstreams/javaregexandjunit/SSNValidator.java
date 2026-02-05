package javaregexandjunit;

public class SSNValidator {

    public static boolean isValidSSN(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }

    public static void main(String[] args) {
        System.out.println("123-45-6789 → " + isValidSSN("123-45-6789")); // true
        System.out.println("123456789 → " + isValidSSN("123456789"));   // false
    }
}
