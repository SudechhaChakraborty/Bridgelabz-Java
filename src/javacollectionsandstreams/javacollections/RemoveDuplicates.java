package javacollectionsandstreams.javacollections;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(3, 1, 2, 2, 3, 4);

        List<Integer> result = new ArrayList<>();

        for (Integer i : list) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }

        System.out.println(result);
    }
}
