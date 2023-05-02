package kz.home.ys.algo.hard.checkingExistenceOfEdgeLengthLimitedPaths;

import java.util.*;

class CheckingExistenceOfEdgeLengthLimitedPathsTLE {

    private Map<Integer, Map<Integer, List<Integer>>> adj;
    private Set<Integer> visited;

    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        visited = new HashSet<>();
        adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new HashMap<>());
        }
        for (int[] edge : edgeList) {
            adj.get(edge[0]).putIfAbsent(edge[1], new ArrayList<>());
            adj.get(edge[0]).get(edge[1]).add(edge[2]);
            adj.get(edge[1]).putIfAbsent(edge[0], new ArrayList<>());
            adj.get(edge[1]).get(edge[0]).add(edge[2]);
        }

        boolean[] result = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            visited.clear();
            result[i] = dfs(queries[i], queries[i][0]);
        }

        return result;
    }

    private boolean dfs(int[] query, int curr) { // [0,1,2], 1
        int target = query[1];
        int limit = query[2];

        if (curr == target) return true;
        if (visited.contains(curr)) return false;
        visited.add(curr);

        Map<Integer, List<Integer>> neighbours = adj.get(curr);
        for (var neighbourEntry : neighbours.entrySet()) {
            int neighbour = neighbourEntry.getKey(); // 1,2
            List<Integer> currLimits = neighbourEntry.getValue(); //2,8
             for ( int currLimit : currLimits) {
                 if (currLimit < limit && dfs(query, neighbour)) return true;
             }

        }

        visited.remove(curr);
        return false;
    }
}









