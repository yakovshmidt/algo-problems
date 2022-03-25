package kz.home.ys.algo.hard.topologicalSort;

import java.util.*;

public final class TopologicalSortUtils {

    static void fillDeps(Integer[][] depsArray, List<Integer[]> deps) {
        Collections.addAll(deps, depsArray);
    }

    static boolean isValidTopologicalOrder(List<Integer> order, List<Integer> jobs, List<Integer[]> deps) {
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
