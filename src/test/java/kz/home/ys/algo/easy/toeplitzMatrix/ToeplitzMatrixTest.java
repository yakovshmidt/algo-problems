package kz.home.ys.algo.easy.toeplitzMatrix;

import junit.framework.TestCase;

public class ToeplitzMatrixTest extends TestCase {

    public void testIsToeplitzMatrix() {
        boolean isToeplitzMatrix = new ToeplitzMatrix().isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}});

        assertTrue(isToeplitzMatrix);
    }
}