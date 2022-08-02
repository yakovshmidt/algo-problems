package kz.home.ys.algo.medium.cheapestFlightsWithinKStops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheapestFlightsWithinKStopsBellmanFordAlgoTest {

    @Test
    public void testFindCheapestPrice() {
        int cheapestPrice = new CheapestFlightsWithinKStopsBellmanFordAlgo().findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1);

        assertEquals(200, cheapestPrice);
    }
}