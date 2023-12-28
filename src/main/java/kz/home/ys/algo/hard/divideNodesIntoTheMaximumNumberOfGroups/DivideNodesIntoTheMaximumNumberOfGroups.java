package kz.home.ys.algo.hard.divideNodesIntoTheMaximumNumberOfGroups;

import java.util.*;

class DivideNodesIntoTheMaximumNumberOfGroups {
    public int magnificentSets(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        List<List<Integer>> unionComponents = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        for (int node = 1; node <= n; node++) {
            if (visited.contains(node)) continue;
            visited.add(node);
            unionComponents.add(new ArrayList<>());
            dfsComponents(node, graph, unionComponents.get(unionComponents.size() - 1), visited);
        }
        int[] componentsMaxTravel = new int[unionComponents.size()];
        int finalRes = 0;
        for (int comp = 0; comp < unionComponents.size(); comp++) {
            for (int compNode : unionComponents.get(comp)) {
                int compRes = bfs(compNode, graph);
                if (compRes == -1) return -1;
                componentsMaxTravel[comp] = Math.max(componentsMaxTravel[comp], compRes);
            }
            finalRes += componentsMaxTravel[comp];
        }

        return finalRes;
    }

    private void dfsComponents(int node, Map<Integer, List<Integer>> graph, List<Integer> component, Set<Integer> visited) {
        component.add(node);
        for (int neighbour : graph.get(node)) {
            if (visited.contains(neighbour)) continue;
            visited.add(neighbour);
            dfsComponents(neighbour, graph, component, visited);
        }
    }

    private int bfs(int node, Map<Integer, List<Integer>> graph) {
        int reach = 0;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> curLevel = new HashSet<>();

        queue.offer(node);
        visited.add(node);

        while (!queue.isEmpty()) {
            int n = queue.size();
            Set<Integer> nextLevel = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int curNode = queue.poll();

                for (int neighbour : graph.get(curNode)) {
                    if (curLevel.contains(neighbour)) return -1;
                    if (visited.contains(neighbour)) continue;
                    nextLevel.add(neighbour);
                    visited.add(neighbour);
                    queue.offer(neighbour);    
                }
            }

            curLevel = nextLevel;
            reach++;
        }

        return reach;
    }
}