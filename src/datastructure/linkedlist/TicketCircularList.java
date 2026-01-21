package datastructure.linkedlist;

class TicketNode {
    int id;
    String name;
    TicketNode next;

    TicketNode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class TicketCircularList {
    TicketNode head;

    void addTicket(int id, String name) {
        TicketNode t = new TicketNode(id, name);
        if (head == null) {
            head = t;
            t.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = t;
        t.next = head;
    }

    void display() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TicketCircularList tc = new TicketCircularList();
        tc.addTicket(1, "Nehaa");
        tc.addTicket(2, "Riya");
        tc.display();
    }
}

