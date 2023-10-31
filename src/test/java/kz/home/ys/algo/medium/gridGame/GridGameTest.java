package kz.home.ys.algo.medium.gridGame;

import junit.framework.TestCase;

public class GridGameTest extends TestCase {

    public void testGridGame() {
        long secondPlayerPoints = new GridGame().gridGame(new int[][]{{20, 3, 20, 17, 2, 12, 15, 17, 4, 15}, {20, 10, 13, 14, 15, 5, 2, 3, 14, 3}});

        assertEquals(63, secondPlayerPoints);
    }
}