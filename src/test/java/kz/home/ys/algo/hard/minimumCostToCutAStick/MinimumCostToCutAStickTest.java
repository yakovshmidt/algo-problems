package kz.home.ys.algo.hard.minimumCostToCutAStick;

import junit.framework.TestCase;

public class MinimumCostToCutAStickTest extends TestCase {

    public void testMinCost() {
        int minCost = new MinimumCostToCutAStick().minCost(7, new int[]{1, 3, 4, 5});

        assertEquals(16, minCost);
    }
}