package kz.home.ys.algo.medium.insertIntervals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertIntervalsTest {

    @Test
    public void testInsert() {
        int[][] insertIntervals = new InsertIntervals().insert(
                new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}},
                new int[]{4, 8}
        );

        assertEquals(3, insertIntervals.length);
        assertEquals(1, insertIntervals[0][0]);
        assertEquals(2, insertIntervals[0][1]);
        assertEquals(3, insertIntervals[1][0]);
        assertEquals(10, insertIntervals[1][1]);
        assertEquals(12, insertIntervals[2][0]);
        assertEquals(16, insertIntervals[2][1]);
    }
}