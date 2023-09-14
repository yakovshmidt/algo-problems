package kz.home.ys.algo.medium.circularArrayLoop;

import junit.framework.TestCase;

public class CircularArrayLoopTest extends TestCase {

    public void testCircularArrayLoop() {
        boolean result = new CircularArrayLoop().circularArrayLoop(new int[]{-1, -2, -3, -4, -5, 6});

        assertFalse(result);
    }

    public void testCircularArrayLoop2() {
        boolean result = new CircularArrayLoop().circularArrayLoop(new int[]{1, -1, 5, 1, 4});

        assertTrue(result);
    }
}