package kz.home.ys.algo.medium.sortAnArray;

import java.util.HashMap;
import java.util.Map;

class SortAnArrayWithCountingSort {

    // time - O(N + K)
    // space - O(N)
    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int idx = 0;
        for (int i = min; i <= max; i++) {
            if (counts.containsKey(i)) {
                int count = counts.get(i);
                while (count > 0) {
                    nums[idx++] = i;
                    count--;
                }
            }
        }
        return nums;
    }
}