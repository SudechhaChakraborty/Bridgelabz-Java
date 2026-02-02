package javacollectionsandstreams.javaexceptions;

class UserAlreadyExistsException extends Exception {
    UserAlreadyExistsException(String msg) {
        super(msg);
    }
}

class UserNotFoundException extends Exception {
    UserNotFoundException(String msg) {
        super(msg);
    }
}

class UserService {

    void registerUser(String username) throws UserAlreadyExistsException {
        if (username.equalsIgnoreCase("admin")) {
            throw new UserAlreadyExistsException("User already exists");
        }
        System.out.println("User registered successfully");
    }

    void checkUserExistence(String username) throws UserNotFoundException {
        if (!username.equalsIgnoreCase("admin")) {
            throw new UserNotFoundException("User not found");
        }
        System.out.println("User exists");
    }
}

public class UserServiceDemo {
    public static void main(String[] args) {
        UserService service = new UserService();

        try {
            service.registerUser("admin");
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.checkUserExistence("john");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}