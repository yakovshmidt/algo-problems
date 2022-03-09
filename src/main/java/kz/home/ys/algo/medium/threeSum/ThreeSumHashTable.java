package kz.home.ys.algo.medium.threeSum;

import java.util.*;

public class ThreeSumHashTable {

    // time - O(N^2)
    // space - O(N)
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> valuesToIndices = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            valuesToIndices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j - 1 && j > 1 && nums[j] == nums[j - 1]) continue;

                int b = nums[j];
                int c = -a - b;
                if (valuesToIndices.containsKey(c) && valuesToIndices.get(c) > j) {
                    result.add(List.of(a, b, c));
                }
            }
        }
        return result;
    }
}
