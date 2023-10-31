package kz.home.ys.algo.medium.maximizeDistanceToClosestPerson;

import junit.framework.TestCase;
import kz.home.ys.algo.medium.maximumWhiteTilesCoveredByACarpet.MaximumWhiteTilesCoveredByACarpet;

public class MaximizeDistanceToClosestPersonTest extends TestCase {

    public void testMaxDistToClosest() {
        int result = new MaximizeDistanceToClosestPerson().maxDistToClosest(new int[]{1, 0, 0, 0});

        assertEquals(3, result);
    }
}