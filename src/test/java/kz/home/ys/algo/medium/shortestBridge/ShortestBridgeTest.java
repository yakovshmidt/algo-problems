package kz.home.ys.algo.medium.shortestBridge;

import junit.framework.TestCase;

public class ShortestBridgeTest extends TestCase {

    public void testShortestBridge() {
        int shortestBridge = new ShortestBridge().shortestBridge(new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}});

        assertEquals(2, shortestBridge);
    }
}