package kz.home.ys.algo.easy.checkIfItIsStraightLine;

import junit.framework.TestCase;

public class CheckIfItIsStraightLineTest extends TestCase {

    public void testCheckStraightLine() {
        CheckIfItIsStraightLine checkIfItIsStraightLine = new CheckIfItIsStraightLine();

        assertFalse(checkIfItIsStraightLine.checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}}));
        assertTrue(checkIfItIsStraightLine.checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
    }
}