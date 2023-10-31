package kz.home.ys.algo.medium.findTwoNonOverlappingSubArraysEachWithTargetSum;

import junit.framework.TestCase;

public class FindTwoNonOverlappingSubArraysEachWithTargetSumTest extends TestCase {

    public void testMinSumOfLengths() {
        int minSumOfLengths = new FindTwoNonOverlappingSubArraysEachWithTargetSum().minSumOfLengths(new int[]{1,6,1}, 7);

        assertEquals(-1, minSumOfLengths);
    }
}