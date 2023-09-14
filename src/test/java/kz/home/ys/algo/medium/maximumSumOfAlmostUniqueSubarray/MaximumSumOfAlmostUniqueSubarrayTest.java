package kz.home.ys.algo.medium.maximumSumOfAlmostUniqueSubarray;

import junit.framework.TestCase;

import java.util.List;

public class MaximumSumOfAlmostUniqueSubarrayTest extends TestCase {

    public void testMaxSum() {
        long maxSum = new MaximumSumOfAlmostUniqueSubarray().maxSum(List.of(2, 6, 7, 3, 1, 7), 3, 4);

        assertEquals(18, maxSum);
    }
}