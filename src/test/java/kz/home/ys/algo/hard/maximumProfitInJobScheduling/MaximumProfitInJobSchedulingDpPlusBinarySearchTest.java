package kz.home.ys.algo.hard.maximumProfitInJobScheduling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProfitInJobSchedulingDpPlusBinarySearchTest {

    @Test
    public void testJobScheduling() {
        int jobScheduling = new MaximumProfitInJobSchedulingDpPlusBinarySearch()
                .jobScheduling(new int[]{1, 2, 3, 3}, new int[]{3, 4, 5, 6}, new int[]{50, 10, 40, 70});

        assertEquals(120, jobScheduling);
    }
}