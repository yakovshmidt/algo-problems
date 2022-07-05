package kz.home.ys.algo.medium.coinChange;

import java.util.Arrays;

class CoinChange {

    // time - O(amount * coinsNumber)
    // space - O(amount + 1)
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(1 + dp[i - coin], dp[i]);
                }
            }
        }
        return (dp[amount] != amount + 1) ? dp[amount] : -1;
    }
}