package javacollectionsandstreams.javaexceptions;

class Connection {
    void open() {
        System.out.println("Connection opened");
    }

    void close() {
        System.out.println("Connection closed");
    }

    void use() {
        throw new RuntimeException("Connection error");
    }
}

public class ResourceCleanupDemo {
    public static void main(String[] args) {
        Connection conn = new Connection();

        try {
            conn.open();
            conn.use();
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            conn.close();
        }
    }
}