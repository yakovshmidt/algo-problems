package kz.home.ys.algo.medium.minimumTimeDifference;

import junit.framework.TestCase;

import java.util.List;

public class MinimumTimeDifferenceTest extends TestCase {

    public void testFindMinDifference() {
        int minDifference = new MinimumTimeDifference().findMinDifference(List.of("00:00", "23:59", "00:00"));

        assertEquals(0, minDifference);
    }
}