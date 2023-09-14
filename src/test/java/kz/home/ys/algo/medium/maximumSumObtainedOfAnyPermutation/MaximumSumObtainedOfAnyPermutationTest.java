package kz.home.ys.algo.medium.maximumSumObtainedOfAnyPermutation;

import junit.framework.TestCase;

public class MaximumSumObtainedOfAnyPermutationTest extends TestCase {

    public void testMaxSumRangeQuery() {
        int result = new MaximumSumObtainedOfAnyPermutation().maxSumRangeQuery(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 1}});

        assertEquals(19, result);
    }
}