package kz.home.ys.algo.medium.binarySubarraysWithSum;

import junit.framework.TestCase;

public class BinarySubarraysWithSumUsingSlidingWindowTest extends TestCase {

    public void testNumSubarraysWithSum() {
        int result = new BinarySubarraysWithSumUsingSlidingWindow().numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2);

        assertEquals(4, result);
    }
}