package kz.home.ys.algo.easy.matrixDiagonalSum;

import junit.framework.TestCase;

public class MatrixDiagonalSumTest extends TestCase {

    public void testDiagonalSum() {
        int diagonalSum = new MatrixDiagonalSum().diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        assertEquals(25, diagonalSum);
    }
}