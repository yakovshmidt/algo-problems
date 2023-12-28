package kz.home.ys.algo.medium.longestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit;

import junit.framework.TestCase;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimitTest extends TestCase {

    public void testLongestSubarray() {
        int result = new LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit().longestSubarray(new int[]{8, 2, 4, 7}, 4);

        assertEquals(2, result);
    }
}