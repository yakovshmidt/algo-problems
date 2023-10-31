package kz.home.ys.algo.medium.bestTimeToBuyAndSellStockWithTransactionFee;

import junit.framework.TestCase;

public class BestTimeToBuyAndSellStockWithTransactionFeeTest extends TestCase {

    public void testMaxProfit() {
        int maxProfit = new BestTimeToBuyAndSellStockWithTransactionFee().maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2);

        assertEquals(8, maxProfit);
    }
}