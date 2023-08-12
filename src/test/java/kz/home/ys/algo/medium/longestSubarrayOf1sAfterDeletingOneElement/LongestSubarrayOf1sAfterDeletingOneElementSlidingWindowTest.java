package kz.home.ys.algo.medium.longestSubarrayOf1sAfterDeletingOneElement;

import junit.framework.TestCase;

public class LongestSubarrayOf1sAfterDeletingOneElementSlidingWindowTest extends TestCase {

    public void testLongestSubarray() {
        int longestSubarray = new LongestSubarrayOf1sAfterDeletingOneElement().longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1});

        assertEquals(5, longestSubarray);
    }
}