package javaregexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtils {

    public int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }
}

class MathUtilsTest {

    @Test
    void testDivideByZero() {
        MathUtils utils = new MathUtils();

        assertThrows(ArithmeticException.class,
                () -> utils.divide(10, 0));
    }
}