package datastructure.linkedlist;
class BookNode {
    int id;
    String title;
    boolean available;
    BookNode next, prev;

    BookNode(int id, String title, boolean available) {
        this.id = id;
        this.title = title;
        this.available = available;
    }
}

public class LibraryDoublyLinkedList {
    BookNode head, tail;

    void addBook(int id, String title) {
        BookNode b = new BookNode(id, title, true);
        if (head == null) {
            head = tail = b;
            return;
        }
        tail.next = b;
        b.prev = tail;
        tail = b;
    }

    void display() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.available);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LibraryDoublyLinkedList lib = new LibraryDoublyLinkedList();
        lib.addBook(1, "Java");
        lib.addBook(2, "DSA");
        lib.display();
    }
}

