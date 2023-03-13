package kz.home.ys.algo.medium.designTicTacToe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeUsingMatrixTest {

    @Test
    public void testMove() {
        TicTacToeUsingMatrix ticTacToeUsingMatrix = new TicTacToeUsingMatrix(3);

        assertEquals(0, ticTacToeUsingMatrix.move(0, 0, 1));
        assertEquals(0, ticTacToeUsingMatrix.move(0, 2, 2));
        assertEquals(0, ticTacToeUsingMatrix.move(2, 2, 1));
        assertEquals(0, ticTacToeUsingMatrix.move(1, 1, 2));
        assertEquals(0, ticTacToeUsingMatrix.move(2, 0, 1));
        assertEquals(0, ticTacToeUsingMatrix.move(1, 0, 2));
        assertEquals(1, ticTacToeUsingMatrix.move(2, 1, 1));
    }
}