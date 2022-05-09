package kz.home.ys.algo.medium.findFirstAndLastPositionOfElementInSortedArray;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void testSearchRange() {
        int[] range = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(
                new int[]{5, 7, 7, 8, 8, 10},
                8
        );

        assertEquals(3, range[0]);
        assertEquals(4, range[1]);
    }
}