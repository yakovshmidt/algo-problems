package kz.home.ys.algo.medium.sortAnArray;

import org.junit.Test;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;
import static org.junit.Assert.assertEquals;

public class SortAnArrayWithMergeSortTest {

    @Test
    public void testSortArray() {
        int[] expected = new int[]{0, 0, 1, 1, 2, 5};

        int[] actual = new SortAnArrayWithMergeSort().sortArray(new int[]{5, 1, 1, 2, 0, 0});

        assertArrays(expected, actual);
    }
}