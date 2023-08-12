package kz.home.ys.algo.medium.minimumSizeSubarraySum;

import java.util.Arrays;

class MinimumSizeSubarraySum {

    // time - O(N)
    // space - O(1)
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int minResult = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum >= target) {
                minResult = Math.min(minResult, r - l + 1);
                sum -= nums[l++];
            }
        }

        return (minResult == Integer.MAX_VALUE) ? 0 : minResult;
    }
}