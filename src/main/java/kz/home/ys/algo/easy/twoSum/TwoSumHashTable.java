package kz.home.ys.algo.easy.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashTable {

    // time - O(N)
    // space - O(N)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valuesToIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            if (valuesToIndices.containsKey(b)) {
                return new int[]{i, valuesToIndices.get(b)};
            }
            valuesToIndices.put(a, i);
        }
        return new int[0];
    }
}
