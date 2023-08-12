package kz.home.ys.algo.hard.lastDayWhereYouCanStillCross;

import junit.framework.TestCase;

public class LastDayWhereYouCanStillCrossTest extends TestCase {

    public void testLatestDayToCross() {
        int result = new LastDayWhereYouCanStillCross().latestDayToCross(2, 2, new int[][]{{1, 1}, {2, 1}, {1, 2}, {2, 2}});

        assertEquals(2, result);
    }
}