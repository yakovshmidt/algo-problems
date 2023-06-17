package kz.home.ys.algo.easy.findWinnerOnATicTacToeGame;

import junit.framework.TestCase;

public class FindWinnerOnATicTacToeGameTest extends TestCase {

    public void testTicTacToe() {
        String result = new FindWinnerOnATicTacToeGame().ticTacToe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}});

        assertEquals("A", result);
    }
}