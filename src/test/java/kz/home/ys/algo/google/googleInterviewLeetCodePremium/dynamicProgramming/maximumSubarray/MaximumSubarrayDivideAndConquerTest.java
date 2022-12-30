package kz.home.ys.algo.google.googleInterviewLeetCodePremium.dynamicProgramming.maximumSubarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarrayDivideAndConquerTest {

    @Test
    public void testMaxSubArray() {
        int maxSubArray = new MaximumSubarrayDivideAndConquer().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        assertEquals(6, maxSubArray);
    }
}