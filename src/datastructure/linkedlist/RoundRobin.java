package datastructure.linkedlist;

class ProcessNode {
    int pid, burst;
    ProcessNode next;

    ProcessNode(int pid, int burst) {
        this.pid = pid;
        this.burst = burst;
    }
}

public class RoundRobin {
    ProcessNode head;

    void addProcess(int pid, int burst) {
        ProcessNode p = new ProcessNode(pid, burst);
        if (head == null) {
            head = p;
            p.next = head;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = p;
        p.next = head;
    }

    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();
        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        System.out.println("Processes added");
    }
}

