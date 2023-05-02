package kz.home.ys.algo.easy.minCostClimbingStairs;

class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = cost[0];  // 10
        dp[1] = cost[1];  // 15

        //Input: cost = [10,15,20]
        for (int i = 2; i <= cost.length; i++) {
            int currCost = i == cost.length ? 0 : cost[i];
            dp[i] = Math.min(dp[i - 1] + currCost, dp[i - 2] + currCost);
        }

        return dp[cost.length];
    }
}