package kz.home.ys.algo.hard.stoneGameIII;

import junit.framework.TestCase;

public class StoneGameIIIBottomUpOptimizedTest extends TestCase {

    public void testStoneGameIII() {
        String result = new StoneGameIIIBottomUpOptimized().stoneGameIII(new int[]{1, 2, 3, 7});

        assertEquals("Bob", result);
    }
}