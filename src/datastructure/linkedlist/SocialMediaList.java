package datastructure.linkedlist;

class UserNode {
    int id;
    String name;
    UserNode next;

    UserNode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SocialMediaList {
    UserNode head;

    void addUser(int id, String name) {
        UserNode u = new UserNode(id, name);
        u.next = head;
        head = u;
    }

    void display() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaList sm = new SocialMediaList();
        sm.addUser(1, "Nehaa");
        sm.addUser(2, "Riya");
        sm.display();
    }
}

