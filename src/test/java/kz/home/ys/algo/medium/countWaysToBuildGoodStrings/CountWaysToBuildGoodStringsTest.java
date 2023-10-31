package kz.home.ys.algo.medium.countWaysToBuildGoodStrings;

import junit.framework.TestCase;

public class CountWaysToBuildGoodStringsTest extends TestCase {

    public void testCountGoodStrings() {
        int goodStrings = new CountWaysToBuildGoodStrings().countGoodStrings(2, 3, 1, 2);

        assertEquals(5, goodStrings);
    }
}