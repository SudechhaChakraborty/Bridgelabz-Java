package javaregexandjunit;

public class LicensePlateValidator {

    public static boolean isValidPlate(String plate) {
        return plate.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public static void main(String[] args) {
        System.out.println("AB1234 → " + isValidPlate("AB1234"));  // true
        System.out.println("A12345 → " + isValidPlate("A12345"));  // false
    }
}
