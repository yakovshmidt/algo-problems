package kz.home.ys.algo.easy.degreeOfAnArray;

import junit.framework.TestCase;

public class DegreeOfAnArrayTest extends TestCase {

    public void testFindShortestSubArray() {
        int shortestSubArraySize = new DegreeOfAnArray().findShortestSubArray(new int[]{1, 3, 2, 2, 3, 1});

        assertEquals(2, shortestSubArraySize);
    }
}