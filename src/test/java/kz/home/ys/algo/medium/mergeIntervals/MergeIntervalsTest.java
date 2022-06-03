package kz.home.ys.algo.medium.mergeIntervals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeIntervalsTest {

    @Test
    public void testMerge() {
        int[][] mergedIntervals = new MergeIntervals().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});

        assertEquals(3, mergedIntervals.length);
        assertEquals(1, mergedIntervals[0][0]);
        assertEquals(6, mergedIntervals[0][1]);
        assertEquals(8, mergedIntervals[1][0]);
        assertEquals(10, mergedIntervals[1][1]);
        assertEquals(15, mergedIntervals[2][0]);
        assertEquals(18, mergedIntervals[2][1]);
    }
}