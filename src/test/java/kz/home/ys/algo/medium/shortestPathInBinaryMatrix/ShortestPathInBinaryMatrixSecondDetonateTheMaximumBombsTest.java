package kz.home.ys.algo.medium.shortestPathInBinaryMatrix;

import junit.framework.TestCase;

public class ShortestPathInBinaryMatrixSecondDetonateTheMaximumBombsTest extends TestCase {

    public void testShortestPathBinaryMatrix() {
        int shortestPath = new ShortestPathInBinaryMatrixSecondSolution().shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 1}});
    }
}