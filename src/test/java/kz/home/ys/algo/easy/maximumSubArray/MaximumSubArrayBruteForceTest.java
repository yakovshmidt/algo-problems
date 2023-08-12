package kz.home.ys.algo.easy.maximumSubArray;

import junit.framework.TestCase;

public class MaximumSubArrayBruteForceTest extends TestCase {

    public void testMaxSubArray() {
        int expected = 6;

        int actual = new MaximumSubArrayBruteForce().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        assertEquals(expected, actual);
    }
}