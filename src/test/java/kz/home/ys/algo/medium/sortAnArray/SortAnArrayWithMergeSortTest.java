package kz.home.ys.algo.medium.sortAnArray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortAnArrayWithMergeSortTest {

    @Test
    public void testSortArray() {
        int[] expected = new int[]{0, 0, 1, 1, 2, 5};

        int[] actual = new SortAnArrayWithMergeSort().sortArray(new int[]{5, 1, 1, 2, 0, 0});

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}