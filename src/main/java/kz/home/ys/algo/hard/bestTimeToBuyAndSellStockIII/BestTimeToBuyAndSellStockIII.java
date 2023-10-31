package kz.home.ys.algo.hard.bestTimeToBuyAndSellStockIII;

class BestTimeToBuyAndSellStockIII {

    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length <= 1) return 0;

        int leftMin = prices[0];
        int rightMax = prices[length - 1];

        int[] leftProfits = new int[length];
        int[] rightProfits = new int[length + 1];

        for (int l = 1; l < length; l++) {
            leftProfits[l] = Math.max(leftProfits[l - 1], prices[l] - leftMin);
            leftMin = Math.min(prices[l], leftMin);
            
            int r = length - l - 1;
            rightProfits[r] = Math.max(rightProfits[r + 1], rightMax - prices[r]);
            rightMax = Math.max(prices[r], rightMax);
        }

        int maxProfit = 0;
        for (int i = 0; i < length; i++) {
            maxProfit = Math.max(maxProfit, leftProfits[i] + rightProfits[i + 1]);
        }
        return maxProfit;
    }
}