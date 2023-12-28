package kz.home.ys.algo.hard.collectCoinsInATree;

import junit.framework.TestCase;

public class CollectCoinsInATreeTest extends TestCase {

    public void testCollectTheCoins() {
        int result = new CollectCoinsInATree().collectTheCoins(new int[]{1, 0, 0, 0, 0, 1}, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}});

        assertEquals(2, result);
    }
}