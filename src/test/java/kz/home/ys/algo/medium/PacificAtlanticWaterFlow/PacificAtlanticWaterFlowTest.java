package kz.home.ys.algo.medium.PacificAtlanticWaterFlow;

import org.junit.Test;

import java.util.List;

public class PacificAtlanticWaterFlowTest {

    @Test
    public void testPacificAtlantic() {
        List<List<Integer>> lists = new PacificAtlanticWaterFlow().pacificAtlantic(new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}});

    }
}