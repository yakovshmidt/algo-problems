package kz.home.ys.algo.medium.stoneGame;

class StoneGame {

    private int[] piles;
    private int[][] dp;

    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        this.piles = piles;
        this.dp = new int[n][n];

        int sum = 0;
        for (int pile : piles) {
            sum += pile;
        }

        return dp(0, n - 1) > (sum / 2);
    }

    private int dp(int l, int r) {
        if (l > r) return 0;
        if (dp[l][r] != 0) return dp[l][r];

        boolean even = (r - l + 1) % 2 == 0;
        int left = even ? piles[l] : 0;
        int right = even ? piles[r] : 0;

        return dp[l][r] = Math.max(dp(l + 1, r) + left, dp(l, r - 1) + right);
    }
}