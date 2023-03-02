package kz.home.ys.algo.medium.largestNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberLeetCodeTest   {

    @Test
    public void testLargestNumber() {
        String largestNumber = new LargestNumberLeetCode().largestNumber(new int[]{3, 30, 34, 5, 9});

        assertEquals("9534330", largestNumber);
    }
}