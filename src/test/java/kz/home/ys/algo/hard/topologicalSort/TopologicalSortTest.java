package kz.home.ys.algo.hard.topologicalSort;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class TopologicalSortTest {

    @Test
    public void testTopologicalSort() {
        List<Integer> jobs = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Integer[][] depsArray = new Integer[][]{{1, 2}, {1, 3}, {3, 2}, {4, 2}, {4, 3}};
        List<Integer[]> deps = new ArrayList<>();
        fillDependencies(depsArray, deps);

        List<Integer> order = new TopologicalSort().topologicalSort(jobs, deps);

        assertTrue(isValidTopologicalOrder(order, jobs, deps));
    }

    void fillDependencies(Integer[][] depsArray, List<Integer[]> deps) {
        Collections.addAll(deps, depsArray);
    }

    boolean isValidTopologicalOrder(List<Integer> order, List<Integer> jobs, List<Integer[]> deps) {
        Map<Integer, Boolean> visited = new HashMap<>();
        for (Integer candidate : order) {
            for (Integer[] dep : deps) {
                if (Objects.equals(candidate, dep[0]) && visited.containsKey(dep[1])) return false;
            }
            visited.put(candidate, true);
        }
        for (Integer job : jobs) {
            if (!visited.containsKey(job)) return false;
        }
        return order.size() == jobs.size();
    }
}