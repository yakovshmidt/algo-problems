package kz.home.ys.algo.google.googleInterviewLeetCodePremium.array.threeSum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTwoPointersTest   {

    @Test
    public void testThreeSum() {
        List<List<Integer>> threeSum = new ThreeSumTwoPointers().threeSum(new int[]{1, -1, -1, 0});

        assertEquals(1, threeSum.size());
    }
}