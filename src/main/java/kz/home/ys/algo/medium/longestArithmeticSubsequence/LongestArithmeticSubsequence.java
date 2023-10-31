package kz.home.ys.algo.medium.longestArithmeticSubsequence;

import java.util.HashMap;
import java.util.Map;

class LongestArithmeticSubsequence {
    public int longestArithSeqLength(int[] nums) {
        /*
        
        Constraints:
        2 <= nums.length <= 1000
        0 <= nums[i] <= 500

        Time: O(N^2)

        Space: O(N^2)
        
        */

        Map<Integer, Integer>[] dp = new HashMap[nums.length];
        int maxLAS = Integer.MIN_VALUE;
        for (int rightIdx = 0; rightIdx < nums.length; rightIdx++) {
            dp[rightIdx] = new HashMap<>();
            for (int leftIdx = 0; leftIdx < rightIdx; leftIdx++) {
                int diff = nums[rightIdx] - nums[leftIdx];
                dp[rightIdx].put(diff, dp[leftIdx].getOrDefault(diff, 1) + 1);
                maxLAS = Math.max(maxLAS, dp[rightIdx].get(diff)); 
            }
        }

        return maxLAS;
    }
}