package kz.home.ys.algo.medium.nonOverlappingIntervals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonOverlappingIntervalsTest {

    @Test
    public void testEraseOverlapIntervals() {
        int minNumberOfIntervalsToRemove = new NonOverlappingIntervals().eraseOverlapIntervals(
                new int[][]{
                        {-52, 31},
                        {-73, -26},
                        {82, 97},
                        {-65, -11},
                        {-62, -49},
                        {95, 99},
                        {58, 95},
                        {-31, 49},
                        {66, 98},
                        {-63, 2},
                        {30, 47},
                        {-40, -26}
                }
        );

        assertEquals(7, minNumberOfIntervalsToRemove);
    }
}