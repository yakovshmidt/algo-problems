package kz.home.ys.algo.easy.countingBits;

class CountingBits {

    // time - O(N) - where N is n
    // space - O(1) - if we ignore dp resulted array
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int offset = 1;
        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) {
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}