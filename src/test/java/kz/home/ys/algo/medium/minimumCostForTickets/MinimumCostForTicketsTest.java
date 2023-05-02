package kz.home.ys.algo.medium.minimumCostForTickets;

import junit.framework.TestCase;

public class MinimumCostForTicketsTest extends TestCase {

    public void testMincostTickets() {
        int minCost = new MinimumCostForTickets().mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15});

        assertEquals(11, minCost);
    }
}