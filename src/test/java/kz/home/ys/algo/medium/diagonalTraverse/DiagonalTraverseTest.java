package kz.home.ys.algo.medium.diagonalTraverse;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class DiagonalTraverseTest extends TestCase {

    public void testFindDiagonalOrder() {
        int[] expected = new int[] {1,2,4,7,5,3,6,8,9};

        int[] actual = new DiagonalTraverse().findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        assertArrays(expected, actual);
    }
}