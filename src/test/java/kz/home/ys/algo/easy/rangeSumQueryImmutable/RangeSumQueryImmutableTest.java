package kz.home.ys.algo.easy.rangeSumQueryImmutable;

import junit.framework.TestCase;

public class RangeSumQueryImmutableTest extends TestCase {

    public void testSumRange() {
        RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, numArray.sumRange(0, 2)); // return (-2) + 0 + 3 = 1
        assertEquals(-1, numArray.sumRange(2, 5)); // return 3 + (-5) + 2 + (-1) = -1
        assertEquals(-3, numArray.sumRange(0, 5)); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
    }
}