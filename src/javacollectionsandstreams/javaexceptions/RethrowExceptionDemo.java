package javacollectionsandstreams.javaexceptions;

public class RethrowExceptionDemo {

    static int performDivision(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator is zero");
        }
        return numerator / denominator;
    }

    static int calculate(int numerator, int denominator) {
        try {
            return performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error in calculation: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            int result = calculate(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}