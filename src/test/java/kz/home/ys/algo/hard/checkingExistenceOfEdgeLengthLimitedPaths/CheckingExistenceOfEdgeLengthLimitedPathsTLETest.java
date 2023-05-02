package kz.home.ys.algo.hard.checkingExistenceOfEdgeLengthLimitedPaths;

import junit.framework.TestCase;

public class CheckingExistenceOfEdgeLengthLimitedPathsTLETest extends TestCase {

    public void testDistanceLimitedPathsExist() {
        boolean[] distanceLimitedPathsExist = new CheckingExistenceOfEdgeLengthLimitedPathsTLE().distanceLimitedPathsExist(
                3,
                new int[][]{{0, 1, 2}, {1, 2, 4}, {2, 0, 8}, {1, 0, 16}},
                new int[][]{{0, 1, 2}, {0, 2, 5}}
        );

        assertFalse(distanceLimitedPathsExist[0]);
        assertTrue(distanceLimitedPathsExist[1]);
    }
}