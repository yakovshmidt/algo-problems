package kz.home.ys.algo.hard.bestTimeToBuyAndSellStockIII;

import junit.framework.TestCase;

public class BestTimeToBuyAndSellStockIIIWithOptimalSpaceTest extends TestCase {

    public void testMaxProfit() {
        int result = new BestTimeToBuyAndSellStockIIIWithOptimalSpace().maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4});

        assertEquals(6, result);
    }
}