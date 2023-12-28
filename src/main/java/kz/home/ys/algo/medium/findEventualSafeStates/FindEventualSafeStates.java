package kz.home.ys.algo.medium.findEventualSafeStates;

import java.util.ArrayList;
import java.util.List;

class FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        boolean[] inStack = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            dfs(i, graph, visited, inStack);
        }

        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < inStack.length; i++) {
            if (!inStack[i]) safeNodes.add(i);
        }

        return safeNodes;
    }

    private boolean dfs(int node, int[][] graph, boolean[] visited, boolean[] inStack) {
        if (inStack[node]) return true;
        if (visited[node]) return false;

        visited[node] = true;
        inStack[node] = true;
        for (int neighbour : graph[node]) {
            if (dfs(neighbour, graph, visited, inStack)) {
                return true;
            }
        }

        inStack[node] = false;
        return false;
    }
}