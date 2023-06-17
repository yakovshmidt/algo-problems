package kz.home.ys.algo.medium.stoneGameII;

import junit.framework.TestCase;

public class GameStoneIITest extends TestCase {

    public void testStoneGameII() {
        int result = new GameStoneII().stoneGameII(new int[]{2, 7, 9, 4, 4});

        assertEquals(10, result);
    }
}