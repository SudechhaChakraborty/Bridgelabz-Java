package datastructure.linkedlist;
class ItemNode {
    int id, qty;
    String name;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}

public class InventoryLinkedList {
    ItemNode head;

    void addItem(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    void totalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.qty * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    public static void main(String[] args) {
        InventoryLinkedList inv = new InventoryLinkedList();
        inv.addItem(1, "Pen", 10, 5);
        inv.addItem(2, "Book", 5, 100);
        inv.totalValue();
    }
}

