package kz.home.ys.algo.medium.maxConsecutiveOnesIII;

import junit.framework.TestCase;

public class MaxConsecutiveOnesIIITest extends TestCase {

    public void testLongestOnes() {
        int result = new MaxConsecutiveOnesIII().longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2);

        assertEquals(6, result);
    }
}