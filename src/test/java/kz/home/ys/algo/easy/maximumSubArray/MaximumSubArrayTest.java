package kz.home.ys.algo.easy.maximumSubArray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubArrayTest {

    @Test
    public void testMaxSubArray() {
        int expected = 6;

        int actual = new MaximumSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        assertEquals(expected, actual);
    }
}