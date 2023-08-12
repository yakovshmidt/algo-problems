package kz.home.ys.algo.medium.leftmostColumnWithAtLeastAOne;

import junit.framework.TestCase;

public class LeftmostColumnWithAtLeastAOneTest extends TestCase {

    public void testLeftMostColumnWithOne() {
        int result = new LeftmostColumnWithAtLeastAOne().leftMostColumnWithOne(new BinaryMatrix(new int[][]{{0, 0}, {0, 1}}));

        assertEquals(1, result);
    }
}