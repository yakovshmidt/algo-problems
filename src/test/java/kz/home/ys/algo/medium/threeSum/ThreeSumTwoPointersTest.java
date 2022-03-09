package kz.home.ys.algo.medium.threeSum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTwoPointersTest {

    @Test
    public void testThreeSum() {
        List<List<Integer>> threeSum = new ThreeSumTwoPointers().threeSum(new int[]{-2, -2, 0, 0, 2, 2});

        assertEquals(1, threeSum.size());
        assertEquals(3, threeSum.get(0).size());
        assertEquals(-2, threeSum.get(0).get(0).intValue());
        assertEquals(0, threeSum.get(0).get(1).intValue());
        assertEquals(2, threeSum.get(0).get(2).intValue());
    }
}