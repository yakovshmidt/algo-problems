package kz.home.ys.algo.medium.subarraySumEqualsK;

import junit.framework.TestCase;

public class SubarraySumEqualsKHashMapTest extends TestCase {

    public void testSubarraySum() {
        int subarraySum = new SubarraySumEqualsKHashMap().subarraySum(new int[]{1, 1, 1}, 2);

        assertEquals(2, subarraySum);
    }
}