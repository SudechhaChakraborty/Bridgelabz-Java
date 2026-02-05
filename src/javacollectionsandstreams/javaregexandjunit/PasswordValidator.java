package javaregexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null || password.length() < 8) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*\\d.*")) return false;
        return true;
    }
}

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Strong123"));
    }

    @Test
    void testInvalidPasswordTooShort() {
        assertFalse(validator.isValid("Ab1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(validator.isValid("strong123"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(validator.isValid("StrongPass"));
    }
}