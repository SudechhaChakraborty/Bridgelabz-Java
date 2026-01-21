package datastructure.linkedlist;

class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String t, String d, int y, double r) {
        title = t;
        director = d;
        year = y;
        rating = r;
    }
}

public class MovieDoublyLinkedList {
    MovieNode head, tail;

    void addMovie(String t, String d, int y, double r) {
        MovieNode node = new MovieNode(t, d, y, r);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        list.addMovie("Inception", "Nolan", 2010, 9.0);
        list.addMovie("Interstellar", "Nolan", 2014, 8.8);
        list.displayForward();
        list.displayReverse();
    }
}

