package kz.home.ys.algo.hard.optimalAccountBalancing;

import junit.framework.TestCase;

public class OptimalAccountBalancingTest extends TestCase {

    public void testMinTransfers() {
        int result = new OptimalAccountBalancing().minTransfers(new int[][]{{0, 1, 10}, {1, 0, 1}, {1, 2, 5}, {2, 0, 5}});

        assertEquals(1, result);
    }
}