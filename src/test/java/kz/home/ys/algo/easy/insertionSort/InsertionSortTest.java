package kz.home.ys.algo.easy.insertionSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] sortedArray = new InsertionSort().insertionSort(new int[]{8, 5, 2, 9, 5, 6, 3});

        assertArrayEquals(new int[]{2, 3, 5, 5, 6, 8, 9}, sortedArray);
    }
}