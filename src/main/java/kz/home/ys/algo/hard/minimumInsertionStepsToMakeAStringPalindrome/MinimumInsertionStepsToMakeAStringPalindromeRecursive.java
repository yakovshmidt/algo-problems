package kz.home.ys.algo.hard.minimumInsertionStepsToMakeAStringPalindrome;

public class MinimumInsertionStepsToMakeAStringPalindromeRecursive {

    // time - O(N^2)
    // space - O(N^2)
    public int minInsertions(String s) {
        int n = s.length();
        String reversedS = new StringBuilder(s).reverse().toString();
        int[][] memo = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                memo[i][j] = -1;
            }
        }
        return n - lps(s, reversedS, n, n, memo);
    }

    private int lps(String s, String reversedS, int n, int m, int[][] memo) {
        if (n == 0 || m == 0) return 0;
        if (memo[n][m] != -1) return memo[n][m];
        if (s.charAt(n - 1) == reversedS.charAt(m - 1)) {
            return memo[n][m] = lps(s, reversedS, n - 1, m - 1, memo) + 1;
        }
        return memo[n][m] = Math.max(lps(s, reversedS, n - 1, m, memo), lps(s, reversedS, n, m - 1, memo));
    }
}
