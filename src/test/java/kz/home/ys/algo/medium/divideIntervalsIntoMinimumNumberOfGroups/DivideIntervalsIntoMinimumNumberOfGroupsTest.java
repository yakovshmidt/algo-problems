package kz.home.ys.algo.medium.divideIntervalsIntoMinimumNumberOfGroups;

import junit.framework.TestCase;

public class DivideIntervalsIntoMinimumNumberOfGroupsTest extends TestCase {

    public void testMinGroups() {
        int minGroups = new DivideIntervalsIntoMinimumNumberOfGroups().minGroups(new int[][]{{5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}});

        assertEquals(3, minGroups);
    }
}