package javacollectionsandstreams.javacollections;

import java.util.*;

public class MaxValueKey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            map.put(sc.next(), sc.nextInt());

        String maxKey = null;
        int max = Integer.MIN_VALUE;

        for (String k : map.keySet()) {
            if (map.get(k) > max) {
                max = map.get(k);
                maxKey = k;
            }
        }

        System.out.println("Max Value Key: " + maxKey);
    }
}
