package kz.home.ys.algo.medium.findMinimumInRotatedSortedArray;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void testFindMin() {
        int min = new FindMinimumInRotatedSortedArray().findMin(new int[]{3, 4, 5, 1, 2});

        assertEquals(1, min);
    }
}