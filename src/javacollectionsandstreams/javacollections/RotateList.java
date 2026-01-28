package javacollectionsandstreams.javacollections;

import java.util.*;

public class RotateList {

    static <T> List<T> rotate(List<T> list, int k) {
        List<T> result = new ArrayList<>();

        for (int i = k; i < list.size(); i++) {
            result.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        System.out.println(rotate(list, 2));
    }
}
