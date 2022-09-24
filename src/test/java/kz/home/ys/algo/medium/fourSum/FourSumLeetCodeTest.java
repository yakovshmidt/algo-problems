package kz.home.ys.algo.medium.fourSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourSumLeetCodeTest {

    @Test
    public void testFourSum() {
        assertEquals(3, new FourSumLeetCode().kSum(new int[]{1, 0, -1, 0, -2, 2}, 0).size());
        assertEquals(0, new FourSumLeetCode().kSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296).size());
    }
}