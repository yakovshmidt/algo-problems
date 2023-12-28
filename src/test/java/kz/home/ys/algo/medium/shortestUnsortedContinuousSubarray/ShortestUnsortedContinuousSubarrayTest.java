package kz.home.ys.algo.medium.shortestUnsortedContinuousSubarray;

import junit.framework.TestCase;

public class ShortestUnsortedContinuousSubarrayTest extends TestCase {

    public void testFindUnsortedSubarray() {
        int result = new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15});

        assertEquals(5, result);
    }
}