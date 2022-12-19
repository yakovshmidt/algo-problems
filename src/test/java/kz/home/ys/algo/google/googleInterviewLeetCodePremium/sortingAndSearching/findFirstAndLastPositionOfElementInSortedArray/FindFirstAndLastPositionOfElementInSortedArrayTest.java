package kz.home.ys.algo.google.googleInterviewLeetCodePremium.sortingAndSearching.findFirstAndLastPositionOfElementInSortedArray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void testSearchRange() {
        int[] searchRange = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);

        assertEquals(3, searchRange[0]);
        assertEquals(4, searchRange[1]);
    }
}