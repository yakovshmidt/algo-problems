package kz.home.ys.algo.hard.minimumCostToMakeAtLeastOneValidPathInAGrid;

import junit.framework.TestCase;

public class MinimumCostToMakeAtLeastOneValidPathInAGridTest extends TestCase {

    public void testMinCost() {
        int minCost = new MinimumCostToMakeAtLeastOneValidPathInAGrid().minCost(
                new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {1, 1, 1, 1}, {2, 2, 2, 2}}
        );

        assertEquals(3, minCost);
    }
}