package kz.home.ys.algo.medium.shortestPathInBinaryMatrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestPathInBinaryMatrixTest {

    @Test
    public void testShortestPathBinaryMatrix() {
        int shortestPath = new ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(
                new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}
        );

        assertEquals(4, shortestPath);
    }
}