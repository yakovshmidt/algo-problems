package kz.home.ys.algo.medium.totalHammingDistance;

import junit.framework.TestCase;

public class TotalHammingDistanceTest extends TestCase {

    public void testTotalHammingDistance() {
        int result = new TotalHammingDistance().totalHammingDistance(new int[]{4, 14, 2});

        assertEquals(6, result);
    }
}