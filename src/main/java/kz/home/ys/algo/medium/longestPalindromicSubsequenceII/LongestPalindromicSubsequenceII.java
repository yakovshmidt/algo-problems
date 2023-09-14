package kz.home.ys.algo.medium.longestPalindromicSubsequenceII;

import java.util.Arrays;

class LongestPalindromicSubsequenceII {

    private int[][][] memo;

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        this.memo = new int[n][n][27];

        for (int[][] r : memo) {
            for (int[] c : r) {
                Arrays.fill(c, -1);
            }
        }

        return lps(s, 0, n - 1, 26);
    }

    private int lps(String s, int l, int r, int prev) {
        if (l >= r) return 0;
        if (memo[l][r][prev] != -1) return memo[l][r][prev];

        char left = s.charAt(l);
        char right = s.charAt(r);

        if (left - 'a' == prev) return lps(s, l + 1, r, prev);
        if (right - 'a' == prev) return lps(s, l, r - 1, prev);

        if (left == right) {
            return memo[l][r][prev] = lps(s, l + 1, r - 1, left - 'a') + 2;
        } else {
            return memo[l][r][prev] = Math.max(
                    lps(s, l + 1, r, prev),
                    lps(s, l, r - 1, prev)
            );
        }
    }
}