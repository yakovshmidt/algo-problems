package kz.home.ys.algo.hard.countAllPossibleRoutes;

import junit.framework.TestCase;

public class CountAllPossibleRoutesTest extends TestCase {

    public void testCountRoutes() {
        int routes = new CountAllPossibleRoutes().countRoutes(new int[]{2, 3, 6, 8, 4}, 1, 3, 5);

        assertEquals(4, routes);
    }
}