package kz.home.ys.algo.medium.subarraySumEqualsK;

import junit.framework.TestCase;

public class SubarraySumEqualsKTest extends TestCase {

    public void testSubarraySum() {
        int subarraySum = new SubarraySumEqualsK().subarraySum(new int[]{1, 2, 3}, 3);

        assertEquals(2, subarraySum);
    }
}