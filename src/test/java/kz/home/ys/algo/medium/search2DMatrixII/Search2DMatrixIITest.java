package kz.home.ys.algo.medium.search2DMatrixII;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Search2DMatrixIITest {

    @Test
    public void testSearchMatrix() {
        assertFalse(new Search2DMatrixII().searchMatrix(
                new int[][]{{1, 1}},
                2
        ));
        assertTrue(new Search2DMatrixII().searchMatrix(
                new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}},
                5
        ));
    }
}