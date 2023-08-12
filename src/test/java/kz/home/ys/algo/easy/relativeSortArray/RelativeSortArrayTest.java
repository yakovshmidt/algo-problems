package kz.home.ys.algo.easy.relativeSortArray;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class RelativeSortArrayTest extends TestCase {

    public void testRelativeSortArray() {
        int[] expected = new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};

        int[] actual = new RelativeSortArray().relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6});

        assertArrays(expected, actual);
    }
}