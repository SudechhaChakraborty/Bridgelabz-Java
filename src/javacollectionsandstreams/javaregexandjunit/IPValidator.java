package javaregexandjunit;

public class IPValidator {

    public static boolean isValidIP(String ip) {
        return ip.matches("^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"
                + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$");
    }

    public static void main(String[] args) {
        System.out.println("192.168.1.1 → " + isValidIP("192.168.1.1")); // true
        System.out.println("256.1.1.1 → " + isValidIP("256.1.1.1"));     // false
    }
}
