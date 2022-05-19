package kz.home.ys.algo.medium.allPathsFromSourceToTarget;

import java.util.ArrayList;
import java.util.List;

class AllPathsFromSourceToTarget {

    // time - O(N * 2^N) - where N is number of nodes
    // space - O(N)
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if (graph == null || graph.length == 0) return new ArrayList<>();

        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        allPathsSourceTarget(graph, 0, path, paths);

        return paths;
    }

    private void allPathsSourceTarget(int[][] graph, int i, List<Integer> currentPath, List<List<Integer>> paths) {
        boolean isTarget = i == graph.length - 1;
        if (isTarget) {
            paths.add(new ArrayList<>(currentPath));
        }

        for (int j = 0; j < graph[i].length; j++) {
            int position = graph[i][j];
            currentPath.add(position);
            allPathsSourceTarget(graph, position, currentPath, paths);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}