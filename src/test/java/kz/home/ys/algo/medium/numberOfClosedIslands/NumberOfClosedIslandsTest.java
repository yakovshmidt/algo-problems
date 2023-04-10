package kz.home.ys.algo.medium.numberOfClosedIslands;

import junit.framework.TestCase;

public class NumberOfClosedIslandsTest extends TestCase {

    public void testClosedIsland() {
        int closedIsland = new NumberOfClosedIslands().closedIsland(new int[][]{{0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}});

        assertEquals(1, closedIsland);
    }
}