package kz.home.ys.algo.easy.nthTribonacciNumber;

import java.util.Arrays;

class NthTribonacciNumber {
    public int tribonacci(int n) {
        int[] dp = new int[38];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        return tribonacci(n, dp);
    }

    private int tribonacci(int n, int[] dp) {
        if (dp[n] != -1) return dp[n];
        if (n == 0) return 0;
        else if (n == 1 || n == 2) return 1;
        else return dp[n] = tribonacci(n - 1, dp) + tribonacci(n - 2, dp) + tribonacci(n - 3, dp);
    }
}