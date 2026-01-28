package javacollectionsandstreams.javacollections;

import java.util.*;

public class BinaryNumbersQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        q.add("1");

        for (int i = 0; i < n; i++) {
            String s = q.remove();
            System.out.print(s + " ");
            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
