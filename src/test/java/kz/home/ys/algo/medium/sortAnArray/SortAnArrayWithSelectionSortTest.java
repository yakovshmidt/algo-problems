package kz.home.ys.algo.medium.sortAnArray;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;
import static org.junit.Assert.assertEquals;

public class SortAnArrayWithSelectionSortTest extends TestCase {

    public void testSortArray() {
        int[] expected = new int[]{0, 0, 1, 1, 2, 5};

        int[] actual = new SortAnArrayWithSelectionSort().sortArray(new int[]{5, 1, 1, 2, 0, 0});

        assertArrays(expected, actual);
    }
}