package kz.home.ys.algo.medium.minimumTimeToCompleteTrips;

import junit.framework.TestCase;

public class MinimumTimeToCompleteTripsTest extends TestCase {

    public void testMinimumTime() {
        long result = new MinimumTimeToCompleteTrips().minimumTime(new int[]{1, 2, 3}, 5);

        assertEquals(3, result);
    }
}