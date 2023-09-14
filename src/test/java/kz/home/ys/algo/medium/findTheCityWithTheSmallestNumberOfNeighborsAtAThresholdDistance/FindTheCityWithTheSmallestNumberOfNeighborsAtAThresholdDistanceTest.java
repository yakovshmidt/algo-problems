package kz.home.ys.algo.medium.findTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance;

import junit.framework.TestCase;

public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistanceTest extends TestCase {

    public void testFindTheCity() {
        int result = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance()
                .findTheCity(4, new int[][]{{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}}, 4);

        assertEquals(3, result);
    }
}