package kz.home.ys.algo.hard.stoneGameIII;

import junit.framework.TestCase;

public class StoneGameIIITopDownTest extends TestCase {

    public void testStoneGameIII() {
        String result = new StoneGameIIITopDown().stoneGameIII(new int[]{1, 2, 3, 6});

        assertEquals("Tie", result);
    }
}