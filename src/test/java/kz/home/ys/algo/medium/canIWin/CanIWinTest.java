package kz.home.ys.algo.medium.canIWin;

import junit.framework.TestCase;

public class CanIWinTest extends TestCase {

    public void testCanIWin() {
        boolean isFirstPlayerWon = new CanIWin().canIWin(10, 11);

        assertFalse(isFirstPlayerWon);
    }
}