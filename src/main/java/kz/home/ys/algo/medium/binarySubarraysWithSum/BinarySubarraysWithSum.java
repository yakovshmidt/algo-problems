package kz.home.ys.algo.medium.binarySubarraysWithSum;

import java.util.HashMap;
import java.util.Map;

class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int x : prefixSum) {
            ans += count.getOrDefault(x, 0);
            count.put(x + goal, count.getOrDefault(x + goal, 0) + 1);
        }

        return ans;
    }
}