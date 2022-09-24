package kz.home.ys.algo.hard.medianOfTwoSortedArrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void testFindMedianSortedArrays() {
        double medianSortedArrays = new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

        assertEquals(2.5, medianSortedArrays, 1);
    }
}