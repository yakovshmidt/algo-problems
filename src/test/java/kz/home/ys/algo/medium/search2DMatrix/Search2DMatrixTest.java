package kz.home.ys.algo.medium.search2DMatrix;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class Search2DMatrixTest {

    @Test
    public void testSearchMatrix() {
        boolean found1 = new Search2DMatrix().searchMatrix(
                new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}},
                3
        );
        boolean found2 = new Search2DMatrix().searchMatrix(new int[][]{{1}, {3}, {5}}, 3);

        assertTrue(found1);
        assertTrue(found2);
    }
}