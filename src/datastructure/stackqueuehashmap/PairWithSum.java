package datastructure.stackqueuehashmap;

import java.util.HashMap;

public class PairWithSum {

    static void findPair(int[] arr, int target) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(target - num)) {
                System.out.println("Pair Found");
                return;
            }
            map.put(num, true);
        }
        System.out.println("No Pair Found");
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3};
        findPair(arr, 10);
    }
}
