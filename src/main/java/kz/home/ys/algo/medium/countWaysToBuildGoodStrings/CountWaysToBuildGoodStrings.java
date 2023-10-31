package kz.home.ys.algo.medium.countWaysToBuildGoodStrings;

import java.util.Arrays;

class CountWaysToBuildGoodStrings {

    private final int mod = 1_000_000_007;
    private int[] dp;

    public int countGoodStrings(int low, int high, int zero, int one) {
        //Input: low = 2, high = 3, zero = 1, one = 2
        // "" -> 0_ -> 00
        //    -> 11 -> 110 -> 011 -> 111

        /*
        
        1. Iterate from low to high -> [2,3]
        2. start from low -> 0_ -> 1 space remaining -> 00
                          -> 11 -> zero spaces remaining so that we stop
        
        0__
        1__

        3. incerment number of spaces to 3
            * 0__ -> 00_ 
            * 11_ ->

        dp[length_of_spaces][value like 0_]

        time - O(high)
        space - O(high)
        
        */

        dp = new int[high + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;

        int answer = 0;
        for (int end = low; end <= high; end++) {
            answer += dfs(end, zero, one);
            answer %= mod;
        }
        return answer;
    }

    private int dfs(int end, int zero, int one) {
        if (dp[end] != -1) {
            return dp[end];
        }
        int count = 0;
        if (end >= one) {
            count += dfs(end - one, zero, one);
        }
        if (end >= zero) {
            count += dfs(end - zero, zero, one);
        }
        dp[end] = count % mod;
        return dp[end];
    }
}












