package javaregexandjunit;

public class UsernameValidator {

    public static boolean isValidUsername(String username) {
        return username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");
    }

    public static void main(String[] args) {

        System.out.println("user_123 → " + isValidUsername("user_123")); // true
        System.out.println("123user → " + isValidUsername("123user"));   // false
        System.out.println("us → " + isValidUsername("us"));             // false
    }
}
