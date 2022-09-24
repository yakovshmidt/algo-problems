package kz.home.ys.algo.hard.medianOfTwoSortedArrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysNeetCodeTest {

    @Test
    public void testFindMedianSortedArrays() {
        MedianOfTwoSortedArraysNeetCode medianOfTwoSortedArraysNeetCode = new MedianOfTwoSortedArraysNeetCode();

        double median = medianOfTwoSortedArraysNeetCode.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});

        assertEquals(2.0, median, 1);
    }
}