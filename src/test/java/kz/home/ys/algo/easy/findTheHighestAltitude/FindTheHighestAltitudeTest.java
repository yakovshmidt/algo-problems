package kz.home.ys.algo.easy.findTheHighestAltitude;

import junit.framework.TestCase;

public class FindTheHighestAltitudeTest extends TestCase {

    public void testLargestAltitude() {
        int largestAltitude = new FindTheHighestAltitude().largestAltitude(new int[]{-5, 1, 5, 0, -7});

        assertEquals(1, largestAltitude);
    }
}