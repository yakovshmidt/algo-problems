package kz.home.ys.algo.medium.makeKSubarraySumsEqual;

import junit.framework.TestCase;

public class MakeKSubarraySumsEqualTest extends TestCase {

    public void testMakeSubKSumEqual() {
        long minNumberOfChanges = new MakeKSubarraySumsEqual().makeSubKSumEqual(new int[]{1, 4, 1, 3}, 2);

        assertEquals(1, minNumberOfChanges);
    }
}