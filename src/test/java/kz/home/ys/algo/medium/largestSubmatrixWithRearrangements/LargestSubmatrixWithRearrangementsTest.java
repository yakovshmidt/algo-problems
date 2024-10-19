package kz.home.ys.algo.medium.largestSubmatrixWithRearrangements;

import junit.framework.TestCase;

public class LargestSubmatrixWithRearrangementsTest extends TestCase {

    public void testLargestSubmatrix() {
        int result = new LargestSubmatrixWithRearrangements().largestSubmatrix(new int[][]{
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 1}
        });

        assertEquals(4, result);
    }
}