package kz.home.ys.algo.medium.stoneGame;

import junit.framework.TestCase;

public class StoneGameTest extends TestCase {

    public void testStoneGame() {
        boolean isAliceWon = new StoneGame().stoneGame(new int[]{5, 3, 4, 5});

        assertTrue(isAliceWon);
    }
}