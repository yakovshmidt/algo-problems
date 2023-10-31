package kz.home.ys.algo.medium.bestTimeToBuyAndSellStockWithTransactionFee;

public class BestTimeToBuyAndSellStockWithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int hold = -prices[0];  // -1, -1
        int free = 0; // 0, 0,

        for (int i = 1; i < n; i++) {
            int temp = hold; // -1
            hold = Math.max(hold, free - prices[i]); // max(1,0 - 3)
            free = Math.max(free, temp + prices[i] - fee); // max(0, -1 + 3 - 2)
        }

        return free;
    }
}
