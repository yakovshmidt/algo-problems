package kz.home.ys.algo.hard.paintHouseII;

import junit.framework.TestCase;

public class PaintHouseIITest extends TestCase {

    public void testMinCostII() {
        int minCostII = new PaintHouseII().minCostII(new int[][]{{1, 5, 3}, {2, 9, 4}});

        assertEquals(5, minCostII);
    }
}