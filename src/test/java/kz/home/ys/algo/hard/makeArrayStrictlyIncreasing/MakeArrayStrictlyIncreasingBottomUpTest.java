package kz.home.ys.algo.hard.makeArrayStrictlyIncreasing;

import junit.framework.TestCase;

public class MakeArrayStrictlyIncreasingBottomUpTest extends TestCase {

    public void testMakeArrayIncreasing() {
        int numberOfOperations = new MakeArrayStrictlyIncreasingBottomUp().makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 3, 2, 4});

        assertEquals(1, numberOfOperations);
    }
}