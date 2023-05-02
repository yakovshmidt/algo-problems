package kz.home.ys.algo.easy.minCostClimbingStairs;

import junit.framework.TestCase;

public class MinCostClimbingStairsTest extends TestCase {

    public void testMinCostClimbingStairs() {
        int minCostClimbingStairs = new MinCostClimbingStairs().minCostClimbingStairs(new int[]{10, 15, 20});

        assertEquals(15, minCostClimbingStairs);
    }
}