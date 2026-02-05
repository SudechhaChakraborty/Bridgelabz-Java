package javaregexandjunit;

public class HexColorValidator {

    public static boolean isValidHexColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }

    public static void main(String[] args) {

        System.out.println("#FFA500 → " + isValidHexColor("#FFA500")); // true
        System.out.println("#ff4500 → " + isValidHexColor("#ff4500")); // true
        System.out.println("#123 → " + isValidHexColor("#123"));       // false
    }
}
