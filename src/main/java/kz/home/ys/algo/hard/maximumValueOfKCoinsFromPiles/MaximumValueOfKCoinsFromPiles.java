package kz.home.ys.algo.hard.maximumValueOfKCoinsFromPiles;

import java.util.Arrays;
import java.util.List;

class MaximumValueOfKCoinsFromPiles {

    // time - O(K*S) - where S is number of coins in all piles
    // space - O(N*K)
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n = piles.size();
        int[][] dp = new int[n + 1][k + 1];
        for (int[] curr : dp) {
            Arrays.fill(curr, -1);
        }

        return backtracking(0, k, dp, piles);
    }

    private int backtracking(int i, int coins, int[][] dp, List<List<Integer>> piles) {
        if (i == piles.size()) return 0;
        if (dp[i][coins] != -1) return dp[i][coins];

        dp[i][coins] = backtracking(i + 1, coins, dp, piles);
        int curPile = 0;
        for (int j = 0; j < Math.min(piles.get(i).size(), coins); j++) {
            curPile += piles.get(i).get(j);
            dp[i][coins] = Math.max(dp[i][coins], curPile + backtracking(i + 1, coins - j - 1, dp, piles));
        }
        return dp[i][coins];
    }
}