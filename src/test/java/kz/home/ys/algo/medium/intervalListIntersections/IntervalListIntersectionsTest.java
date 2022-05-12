package kz.home.ys.algo.medium.intervalListIntersections;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IntervalListIntersectionsTest {

    @Test
    public void testIntervalIntersection() {
        int[][] intersections = new IntervalListIntersections().intervalIntersection(
                new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}}
        );
        int[][] expected = new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};

        for (int i = 0; i < intersections.length; i++) {
            assertEquals(expected[i][0], intersections[i][0]);
            assertEquals(expected[i][1], intersections[i][1]);
        }
    }
}