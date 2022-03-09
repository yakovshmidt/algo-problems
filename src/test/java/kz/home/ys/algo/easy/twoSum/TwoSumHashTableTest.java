package kz.home.ys.algo.easy.twoSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumHashTableTest {

    @Test
    public void testTwoSum() {
        int[] twoSum = new TwoSumHashTable().twoSum(new int[]{2, 7, 11, 15}, 9);

        assertEquals(2, twoSum.length);
        assertEquals(1, twoSum[0]);
        assertEquals(0, twoSum[1]);
    }
}