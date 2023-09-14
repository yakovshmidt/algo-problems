package kz.home.ys.algo.medium.cheapestFlightsWithinKStops;

import junit.framework.TestCase;

public class CheapestFlightsWithinKStopsBFSTest extends TestCase {

    public void testFindCheapestPrice() {
        int cheapestPrice = new CheapestFlightsWithinKStopsBFS().findCheapestPrice(
                4,
                new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}},
                0,
                3,
                1
        );

        assertEquals(700, cheapestPrice);
    }
}