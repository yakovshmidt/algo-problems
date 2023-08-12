package kz.home.ys.algo.medium.sortAnArray;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class SortAnArrayWithCountingSortTest extends TestCase {

    public void testSortArray() {
        int[] expected = new int[]{0, 0, 1, 1, 2, 5};

        int[] actual = new SortAnArrayWithCountingSort().sortArray(new int[]{5, 1, 1, 2, 0, 0});

        assertArrays(expected, actual);
    }
}