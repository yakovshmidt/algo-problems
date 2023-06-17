package kz.home.ys.algo.medium.fourSum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FourSumTwoPointersTest {

    @Test
    public void testFourSum() {
        List<List<Integer>> fourSum = new FourSumTwoPointers().fourSum(new int[]{2, 2, 2, 2, 2}, 8);

        assertEquals(1, fourSum.size());
        assertEquals(4, fourSum.get(0).size());
        assertEquals(2, fourSum.get(0).get(0).intValue());
        assertEquals(2, fourSum.get(0).get(1).intValue());
        assertEquals(2, fourSum.get(0).get(2).intValue());
        assertEquals(2, fourSum.get(0).get(3).intValue());
    }

    @Test
    public void testFourSum2() {
        List<List<Integer>> fourSum = new FourSumTwoPointers().fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);

        assertEquals(0, fourSum.size());
    }
}