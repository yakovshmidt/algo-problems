package kz.home.ys.algo.medium.designTicTacToe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeTest {

    @Test
    public void testMove() {
        TicTacToe ticTacToe = new TicTacToe(3);

        assertEquals(0, ticTacToe.move(0, 0, 1));
        assertEquals(0, ticTacToe.move(0, 2, 2));
        assertEquals(0, ticTacToe.move(2, 2, 1));
        assertEquals(0, ticTacToe.move(1, 1, 2));
        assertEquals(0, ticTacToe.move(2, 0, 1));
        assertEquals(0, ticTacToe.move(1, 0, 2));
        assertEquals(1, ticTacToe.move(2, 1, 1));
    }
}