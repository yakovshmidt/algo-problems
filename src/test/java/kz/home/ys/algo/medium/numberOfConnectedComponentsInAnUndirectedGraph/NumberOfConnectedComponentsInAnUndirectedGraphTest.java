package kz.home.ys.algo.medium.numberOfConnectedComponentsInAnUndirectedGraph;

import junit.framework.TestCase;
import kz.home.ys.algo.medium.numberOfProvinces.NumberOfProvincesWithRankedDisjointSet;

public class NumberOfConnectedComponentsInAnUndirectedGraphTest extends TestCase {

    public void testCountComponents() {
        int numberOfComponents = new NumberOfConnectedComponentsInAnUndirectedGraph().countComponents(4, new int[][]{{0, 1}, {2, 3}, {1, 2}});

        assertEquals(1, numberOfComponents);
    }
}