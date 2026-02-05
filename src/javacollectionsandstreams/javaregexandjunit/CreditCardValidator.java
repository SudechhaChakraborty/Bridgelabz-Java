package javaregexandjunit;

public class CreditCardValidator {

    public static boolean isValidCard(String card) {
        return card.matches("^(4\\d{15}|5\\d{15})$");
    }

    public static void main(String[] args) {
        System.out.println("4123456789012345 → " + isValidCard("4123456789012345")); // true
        System.out.println("5123456789012345 → " + isValidCard("5123456789012345")); // true
        System.out.println("6123456789012345 → " + isValidCard("6123456789012345")); // false
    }
}
