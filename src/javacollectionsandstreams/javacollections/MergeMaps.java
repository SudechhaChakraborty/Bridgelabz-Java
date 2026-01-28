package javacollectionsandstreams.javacollections;

import java.util.*;

public class MergeMaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        System.out.print("Map1 size: ");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++)
            map1.put(sc.next(), sc.nextInt());

        System.out.print("Map2 size: ");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++)
            map2.put(sc.next(), sc.nextInt());

        for (String k : map2.keySet())
            map1.put(k, map1.getOrDefault(k, 0) + map2.get(k));

        System.out.println(map1);
    }
}
