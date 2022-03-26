package kz.home.ys.algo.medium.searchInSortedMatrix;

import org.junit.Test;

import static kz.home.ys.algo.medium.searchInSortedMatrix.SearchInSortedMatrixUtils.compare;
import static org.junit.Assert.assertTrue;

public class SearchInSortedMatrixBruteForceTest {

    @Test
    public void testSearchInSortedMatrix() {
        int[][] matrix = {
                {1, 4, 7, 12, 15, 1000},
                {2, 5, 19, 31, 32, 1001},
                {3, 8, 24, 33, 35, 1002},
                {40, 41, 42, 44, 45, 1003},
                {99, 100, 103, 106, 128, 1004},
        };
        int[] expected = {3, 3};

        int[] output = new SearchInSortedMatrixBruteForce().searchInSortedMatrix(matrix, 44);

        assertTrue(compare(output, expected));
    }
}