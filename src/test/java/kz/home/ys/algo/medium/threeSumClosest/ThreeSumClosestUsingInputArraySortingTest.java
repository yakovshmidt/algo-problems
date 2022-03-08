package kz.home.ys.algo.medium.threeSumClosest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeSumClosestUsingInputArraySortingTest {

    @Test
    public void testThreeSumClosest() {
        int threeSumClosest = new ThreeSumClosestUsingInputArraySorting().threeSumClosest(new int[]{-1, 2, 1, -4}, 1);

        assertEquals(2, threeSumClosest);
    }
}