package kz.home.ys.algo.medium.minimumPenaltyForAShop;

import junit.framework.TestCase;

public class MinimumPenaltyForAShopTest extends TestCase {

    public void testBestClosingTime() {
        int result = new MinimumPenaltyForAShop().bestClosingTime("YYNY");

        assertEquals(2, result);
    }
}