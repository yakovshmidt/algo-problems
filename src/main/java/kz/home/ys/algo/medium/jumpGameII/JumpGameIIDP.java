package kz.home.ys.algo.medium.jumpGameII;

import java.util.Arrays;

class JumpGameIIDP {

    // time - O(N^2)
    // space - O(N)
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[nums.length - 1] = 0;
        
        for (int i = nums.length - 2; i >= 0; i--) {
            int jumps = nums[i];
            while (jumps != 0) {
                int nextIdx = jumps + i;
                if (nextIdx < nums.length && dp[nextIdx] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[nextIdx] + 1, dp[i]);
                }
                
                jumps--;
            }
        }
        
        return dp[0];
    }
}