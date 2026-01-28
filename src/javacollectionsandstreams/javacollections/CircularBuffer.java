package javacollectionsandstreams.javacollections;

import java.util.*;

public class CircularBuffer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Buffer size: ");
        int size = sc.nextInt();

        Queue<Integer> q = new ArrayDeque<>(size);

        while (true) {
            System.out.print("Enter value (-1 to stop): ");
            int x = sc.nextInt();
            if (x == -1) break;

            if (q.size() == size)
                q.remove();

            q.add(x);
            System.out.println("Buffer: " + q);
        }
    }
}
