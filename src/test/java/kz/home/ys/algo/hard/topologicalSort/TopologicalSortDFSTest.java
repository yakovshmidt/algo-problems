package kz.home.ys.algo.hard.topologicalSort;

import org.junit.Test;

import java.util.*;

import static kz.home.ys.algo.hard.topologicalSort.TopologicalSortUtils.fillDeps;
import static kz.home.ys.algo.hard.topologicalSort.TopologicalSortUtils.isValidTopologicalOrder;
import static org.junit.Assert.assertTrue;

public class TopologicalSortDFSTest {

    @Test
    public void testTopologicalSort() {
        List<Integer> jobs = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Integer[][] depsArray = new Integer[][]{{1, 2}, {1, 3}, {3, 2}, {4, 2}, {4, 3}};
        List<Integer[]> deps = new ArrayList<>();
        fillDeps(depsArray, deps);

        List<Integer> order = new TopologicalSortDFS().topologicalSort(jobs, deps);

        assertTrue(isValidTopologicalOrder(order, jobs, deps));
    }
}