package kz.home.ys.algo.medium.gameOfLife;

import org.junit.Assert;
import org.junit.Test;

public class GameOfLifeTest {

    @Test
    public void testGameOfLife() {
        int[][] board = {{1, 1}, {1, 0}};
        new GameOfLife().gameOfLife(board);

        Assert.assertEquals(1, board[0][0]);
        Assert.assertEquals(1, board[0][1]);
        Assert.assertEquals(1, board[1][0]);
        Assert.assertEquals(1, board[1][1]);
    }
}