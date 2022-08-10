package kz.home.ys.algo.medium.decodeWays;

import java.util.Arrays;

class DecodeWays {

    // time - O(N)
    // space - O(N)
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return dfs(s, 0, dp);
    }

    private int dfs(String s, int idx, int[] dp) {
        if (idx >= s.length()) return 1;
        if (dp[idx] != -1) return dp[idx];
        if (s.charAt(idx) == '0') return 0;

        int result = dfs(s, idx + 1, dp);
        if (idx + 1 < s.length() && (s.charAt(idx) == '1' || s.charAt(idx) == '2' && s.charAt(idx + 1) < '7')) {
            result += dfs(s, idx + 2, dp);
        }
        dp[idx] = result;
        return result;
    }
}