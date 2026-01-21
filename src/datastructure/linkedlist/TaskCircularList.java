package datastructure.linkedlist;

class TaskNode {
    int id, priority;
    String name;
    TaskNode next;

    TaskNode(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
}

public class TaskCircularList {
    TaskNode head = null;

    void addTask(int id, String name, int priority) {
        TaskNode node = new TaskNode(id, name, priority);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void display() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskCircularList list = new TaskCircularList();
        list.addTask(1, "Coding", 1);
        list.addTask(2, "Testing", 2);
        list.display();
    }
}

