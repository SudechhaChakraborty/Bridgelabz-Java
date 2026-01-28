package javacollectionsandstreams.javacollections;

import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.println("Enter text:");
        String text = sc.nextLine().toLowerCase().replaceAll("[^a-z ]", "");

        for (String word : text.split(" ")) {
            if (!word.isEmpty())
                map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
