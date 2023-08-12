package kz.home.ys.algo.medium.minimumSizeSubarraySum;

import junit.framework.TestCase;

public class MinimumSizeSubarraySumTest extends TestCase {

    public void testMinSubArrayLen() {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();

        assertEquals(3, minimumSizeSubarraySum.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
        assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}