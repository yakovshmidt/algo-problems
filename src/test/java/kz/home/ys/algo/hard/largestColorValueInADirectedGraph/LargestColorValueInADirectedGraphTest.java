package kz.home.ys.algo.hard.largestColorValueInADirectedGraph;

import junit.framework.TestCase;

public class LargestColorValueInADirectedGraphTest extends TestCase {

    public void testLargestPathValue() {
        int largestPathValue = new LargestColorValueInADirectedGraph().largestPathValue("abaca", new int[][]{{0, 1}, {0, 2}, {2, 3}, {3, 4}});

        assertEquals(3, largestPathValue);
    }
}