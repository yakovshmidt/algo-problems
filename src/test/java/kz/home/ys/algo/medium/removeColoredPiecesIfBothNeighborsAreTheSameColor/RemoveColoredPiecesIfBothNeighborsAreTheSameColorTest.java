package kz.home.ys.algo.medium.removeColoredPiecesIfBothNeighborsAreTheSameColor;

import junit.framework.TestCase;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColorTest extends TestCase {

    public void testWinnerOfGame() {
        boolean isAliceWon = new RemoveColoredPiecesIfBothNeighborsAreTheSameColor().winnerOfGame("AAABABB");

        assertTrue(isAliceWon);
    }
}