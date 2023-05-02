package kz.home.ys.algo.hard.profitableSchemas;

import java.util.Arrays;

class ProfitableSchemasUpBottom {

    private int mod = 1000000007;
    private int n;
    private int minProfit;
    private int[] group;
    private int[] profit;
    private int[][][] memo = new int[101][101][101];

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        /*

        Input: n = 10, minProfit = 5, group = [2,3,5], profit = [6,87,]

        1. we should take all combinations of groups
            2
            3
            5
            2 3
            2 5
            3 5
            2 3 5

            if number of members <= n
            and if profit >= minProfit

        */
        this.n = n;
        this.minProfit = minProfit;
        this.group = group;
        this.profit = profit;

        for (int i = 0; i <= this.group.length; i++) {
            for (int j = 0; j <= this.n; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return profitableSchemesHelper(0, 0, 0);
    }

    private int profitableSchemesHelper(int currProfit, int currMembers, int idx) {
        if (idx == this.group.length) {
            return currProfit >= this.minProfit ? 1 : 0;
        }

        if (memo[idx][currMembers][currProfit] != -1) {
            return memo[idx][currMembers][currProfit];
        }

        int totalWays = profitableSchemesHelper(currProfit, currMembers, idx + 1);
        if (currMembers + this.group[idx] <= n) {
            totalWays += profitableSchemesHelper(Math.min(this.minProfit, currProfit + this.profit[idx]), currMembers + group[idx], idx + 1);
        }

        return memo[idx][currMembers][currProfit] = totalWays % this.mod;
    }
}




