package kz.home.ys.algo.medium.circularArrayLoop;

import junit.framework.TestCase;

public class CircularArrayLoopWithTwoPointersTest extends TestCase {

    public void testCircularArrayLoop() {
        boolean result = new CircularArrayLoopWithTwoPointers().circularArrayLoop(new int[]{-1, -2, -3, -4, -5, 6});

        assertFalse(result);
    }
}