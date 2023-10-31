package kz.home.ys.algo.medium.minimumNumberOfVerticesToReachAllNodes;

import junit.framework.TestCase;

import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodesTest extends TestCase {

    public void testFindSmallestSetOfVertices() {
        List<Integer> smallestSetOfVertices = new MinimumNumberOfVerticesToReachAllNodes().findSmallestSetOfVertices(
                6,
                List.of(List.of(0, 1), List.of(0, 2), List.of(2, 5), List.of(3, 4), List.of(4, 2))
        );

        assertEquals(2, smallestSetOfVertices.size());
        assertEquals(0, smallestSetOfVertices.get(0).intValue());
        assertEquals(3, smallestSetOfVertices.get(1).intValue());
    }
}