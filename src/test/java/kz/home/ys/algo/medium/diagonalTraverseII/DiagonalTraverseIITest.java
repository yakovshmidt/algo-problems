package kz.home.ys.algo.medium.diagonalTraverseII;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class DiagonalTraverseIITest extends TestCase {

    public void testFindDiagonalOrder() {
        int[] expected = new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16};

        int[] actual = new DiagonalTraverseII().findDiagonalOrder(
                List.of(
                        List.of(1, 2, 3, 4, 5),
                        List.of(6, 7),
                        List.of(8),
                        List.of(9, 10, 11),
                        List.of(12, 13, 14, 15, 16)
                )
        );

        assertArrays(expected, actual);
    }
}