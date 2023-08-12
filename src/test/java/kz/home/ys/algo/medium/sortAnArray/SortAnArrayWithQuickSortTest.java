package kz.home.ys.algo.medium.sortAnArray;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class SortAnArrayWithQuickSortTest extends TestCase {

    public void testSortArray() {
        int[] expected = new int[]{0, 0, 1, 1, 2, 5};

        int[] actual = new SortAnArrayWithQuickSort().sortArray(new int[]{5, 1, 1, 2, 0, 0});

        assertArrays(expected, actual);
    }

    public void testSortArray2() {
        int[] expected = new int[]{1, 2, 3, 5};

        int[] actual = new SortAnArrayWithQuickSort().sortArray(new int[]{5, 2, 3, 1});

        assertArrays(expected, actual);
    }
}