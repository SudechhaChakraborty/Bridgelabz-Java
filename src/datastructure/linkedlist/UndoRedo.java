package datastructure.linkedlist;
class TextNode {
    String text;
    TextNode next, prev;

    TextNode(String text) {
        this.text = text;
    }
}

public class UndoRedo {
    TextNode current;

    void addState(String text) {
        TextNode node = new TextNode(text);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    public static void main(String[] args) {
        UndoRedo ur = new UndoRedo();
        ur.addState("Hello");
        ur.addState("Hello World");
        ur.undo();
        System.out.println(ur.current.text);
    }
}

