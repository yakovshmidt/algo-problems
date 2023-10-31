package kz.home.ys.algo.medium.numberOfOperationsToMakeNetworkConnected;

import java.util.*;

class NumberOfOperationsToMakeNetworkConnected {

    // time - O(n + e)
    // space - (n + e)
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;

        Map<Integer, List<Integer>> connectionsMap = findConnections(n, connections);
        Set<Integer> visited = new HashSet<>();

        int numberOfConnectedComponents = 0;
        for (int i = 0; i < n; i++) {
            if (visited.contains(i)) continue;
            numberOfConnectedComponents++;
            bfs(i, connectionsMap, visited);
        }

        return numberOfConnectedComponents - 1;
    }

    private void bfs(int curr, Map<Integer, List<Integer>> connections, Set<Integer> visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(curr);

        while (!stack.isEmpty()) {
            int computer = stack.pop();
            if (visited.contains(computer)) continue;
            visited.add(computer);

            List<Integer> neighbours = connections.getOrDefault(computer, new ArrayList<>());
            for (int neighbour : neighbours) {
                if (visited.contains(neighbour)) continue;
                stack.push(neighbour);
            }
        }
    }

    private Map<Integer, List<Integer>> findConnections(int n, int[][] connections) {
        Map<Integer, List<Integer>> connectionsMap = new HashMap<>();
        for (int[] connection : connections) {
            connectionsMap.putIfAbsent(connection[0], new ArrayList<>());
            connectionsMap.putIfAbsent(connection[1], new ArrayList<>());
            connectionsMap.get(connection[0]).add(connection[1]);
            connectionsMap.get(connection[1]).add(connection[0]);
        }
        return connectionsMap;
    }
}
