package kz.home.ys.algo.medium.maximumSumCircularSubarray;

import junit.framework.TestCase;

public class MaximumSumCircularSubarrayTest extends TestCase {

    public void testMaxSubarraySumCircular() {
        int result = new MaximumSumCircularSubarray().maxSubarraySumCircular(new int[]{5, -3, 5});

        assertEquals(10, result);
    }
}