package kz.home.ys.algo.hard.findCriticalAndPseudoCriticalEdgesInMinimumSpanningTree;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTreeTest extends TestCase {

    public void testFindCriticalAndPseudoCriticalEdges() {
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(2, 3, 4, 5));

        List<List<Integer>> actual = new FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree()
                .findCriticalAndPseudoCriticalEdges(
                        5,
                        new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 2}, {0, 3, 2}, {0, 4, 3}, {3, 4, 3}, {1, 4, 6}}
                );

        assertMatrices(expected, actual);
    }
}