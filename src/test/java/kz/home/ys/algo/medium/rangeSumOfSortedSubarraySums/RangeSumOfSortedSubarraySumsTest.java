package kz.home.ys.algo.medium.rangeSumOfSortedSubarraySums;

import junit.framework.TestCase;

public class RangeSumOfSortedSubarraySumsTest extends TestCase {

    public void testRangeSum() {
        int rangeSum = new RangeSumOfSortedSubarraySums().rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 5);

        assertEquals(13, rangeSum);
    }
}