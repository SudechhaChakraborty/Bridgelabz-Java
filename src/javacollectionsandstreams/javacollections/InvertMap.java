package javacollectionsandstreams.javacollections;

import java.util.*;

public class InvertMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            map.put(sc.next(), sc.nextInt());

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (String key : map.keySet()) {
            inverted
                    .computeIfAbsent(map.get(key), k -> new ArrayList<>())
                    .add(key);
        }

        System.out.println(inverted);
    }
}
