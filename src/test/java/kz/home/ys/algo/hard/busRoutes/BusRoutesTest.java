package kz.home.ys.algo.hard.busRoutes;

import junit.framework.TestCase;

public class BusRoutesTest extends TestCase {

    public void testNumBusesToDestination() {
        int result = new BusRoutes().numBusesToDestination(new int[][]{{1, 2, 7}, {3, 6, 7}}, 1, 6);

        assertEquals(2, result);
    }
}