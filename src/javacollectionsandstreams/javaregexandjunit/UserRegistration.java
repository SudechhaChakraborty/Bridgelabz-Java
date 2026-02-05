package javaregexandjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistration {

    public void registerUser(String username, String email, String password) {

        if (username == null || username.isBlank())
            throw new IllegalArgumentException("Invalid username");

        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("Invalid email");

        if (password == null || password.length() < 6)
            throw new IllegalArgumentException("Invalid password");
    }
}

class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() ->
                registration.registerUser("john", "john@gmail.com", "secret123"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("", "john@gmail.com", "secret123"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("john", "johnmail.com", "secret123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("john", "john@gmail.com", "123"));
    }
}