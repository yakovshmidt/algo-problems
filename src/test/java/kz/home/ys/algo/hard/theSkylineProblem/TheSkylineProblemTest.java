package kz.home.ys.algo.hard.theSkylineProblem;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class TheSkylineProblemTest extends TestCase {

    public void testGetSkyline() {
        List<List<Integer>> expected = List.of(
                List.of(2, 10),
                List.of(3, 15),
                List.of(7, 12),
                List.of(12, 0),
                List.of(15, 10),
                List.of(20, 8),
                List.of(24, 0)
        );

        List<List<Integer>> actual = new TheSkylineProblem().getSkyline(
                new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}}
        );

        assertMatrices(expected, actual);
    }
}