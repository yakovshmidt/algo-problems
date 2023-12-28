package kz.home.ys.algo.hard.divideNodesIntoTheMaximumNumberOfGroups;

import junit.framework.TestCase;

public class DivideNodesIntoTheMaximumNumberOfGroupsTest extends TestCase {

    public void testMagnificentSets() {
        int result = new DivideNodesIntoTheMaximumNumberOfGroups().magnificentSets(6, new int[][]{{1, 2}, {1, 4}, {1, 5}, {2, 6}, {2, 3}, {4, 6}});

        assertEquals(4, result);
    }
}