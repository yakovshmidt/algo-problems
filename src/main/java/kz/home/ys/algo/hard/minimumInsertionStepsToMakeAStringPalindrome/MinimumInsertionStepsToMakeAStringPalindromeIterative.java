package kz.home.ys.algo.hard.minimumInsertionStepsToMakeAStringPalindrome;

class MinimumInsertionStepsToMakeAStringPalindromeIterative {

    // time - O(N^2)
    // space - O(N^2)
    public int minInsertions(String s) {
        int n = s.length();
        String reversedS = new StringBuilder(s).reverse().toString();

        return n - lps(s, reversedS, n, n);
    }

    private int lps(String s, String reversedS, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s.charAt(i - 1) == reversedS.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}