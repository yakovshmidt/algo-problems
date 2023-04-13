package kz.home.ys.algo.medium.integerBreak;

class IntegerBreakIterative {

    public int integerBreak(int n) {
        if (n <= 2) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 2; i <= n; i++) {
            dp[i] = i == n ? 0 : i;
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
            }
        }
        return dp[n];
    }
}