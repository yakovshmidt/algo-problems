package kz.home.ys.algo.hard.minimumCostToCutAStick;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class MinimumCostToCutAStick {

    private int[] newCuts;
    private int[][] memo;

    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        this.memo = new int[m + 2][m + 2];
        this.newCuts = new int[m + 2];
        this.newCuts[m + 1] = n;
        System.arraycopy(cuts, 0, newCuts, 1, m);
        Arrays.sort(newCuts);
        for (int[] ints : memo) {
            Arrays.fill(ints, -1);
        }

        return dp(0, newCuts.length - 1);
    }

    private int dp(int left, int right) {
        if (memo[left][right] != -1) return memo[left][right];
        if (right - left == 1) return 0;
        int ans = Integer.MAX_VALUE;
        for (int mid = left + 1; mid < right; mid++) {
            int cost = dp(left, mid) + dp(mid, right) + newCuts[right] - newCuts[left];
            ans = Math.min(ans, cost);
        }
        memo[left][right] = ans;
        return ans;
    }
}