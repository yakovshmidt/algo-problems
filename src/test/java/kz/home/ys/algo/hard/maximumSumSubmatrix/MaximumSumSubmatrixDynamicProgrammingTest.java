package kz.home.ys.algo.hard.maximumSumSubmatrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSumSubmatrixDynamicProgrammingTest {

    @Test
    public void testMaximumSumSubmatrix() {
        int[][] matrix = new int[][]{{5, 3, -1, 5}, {-7, 3, 7, 4}, {12, 8, 0, 0}, {1, -8, -8, 2}};
        int size = 2;
        int expected = 18;

        var actual = new MaximumSumSubmatrixBruteForce().maximumSumSubmatrix(matrix, size);

        assertEquals(expected, actual);
    }
}