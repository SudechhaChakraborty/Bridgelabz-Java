package javaregexandjunit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        NumberUtils utils = new NumberUtils();

        if (number % 2 == 0)
            assertTrue(utils.isEven(number));
        else
            assertFalse(utils.isEven(number));
    }
}