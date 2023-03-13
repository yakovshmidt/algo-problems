package kz.home.ys.algo.medium.fourSumII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourSumIITest {

    @Test
    public void testFourSumCount() {
        int zeroSumCount = new FourSumII().fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2});

        assertEquals(2, zeroSumCount);
    }
}