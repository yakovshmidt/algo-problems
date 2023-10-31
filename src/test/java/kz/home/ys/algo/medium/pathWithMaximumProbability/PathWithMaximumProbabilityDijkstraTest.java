package kz.home.ys.algo.medium.pathWithMaximumProbability;

import junit.framework.TestCase;

public class PathWithMaximumProbabilityDijkstraTest extends TestCase {

    public void testMaxProbability() {
        double maxProbability = new PathWithMaximumProbabilityDijkstra().maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.2}, 0, 2);

        assertEquals(0.25, maxProbability, 2);
    }
}