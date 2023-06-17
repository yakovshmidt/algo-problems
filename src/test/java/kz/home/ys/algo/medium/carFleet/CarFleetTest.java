package kz.home.ys.algo.medium.carFleet;

import junit.framework.TestCase;

public class CarFleetTest extends TestCase {

    public void testCarFleet() {
        int carFleet = new CarFleet().carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3});

        assertEquals(3, carFleet);
    }
}