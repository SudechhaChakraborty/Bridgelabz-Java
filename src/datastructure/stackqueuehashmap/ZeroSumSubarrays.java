package datastructure.stackqueuehashmap;

import java.util.HashMap;

public class ZeroSumSubarrays {

    static void findSubarrays(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int num : arr) {
            sum += num;
            if (sum == 0 || map.containsKey(sum))
                System.out.println("Zero sum subarray exists");
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        findSubarrays(arr);
    }
}

