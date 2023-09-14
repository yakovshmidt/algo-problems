package kz.home.ys.algo.medium.minimumFuelCostToReportToTheCapital;

import java.util.*;

class MinimumFuelCostToReportToTheCapital {
    public long minimumFuelCost(int[][] roads, int seats) {
        int n = roads.length + 1;
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] degree = new int[n];

        for (int[] road :roads) {
            adj.computeIfAbsent(road[0], k -> new ArrayList<>()).add(road[1]);
            adj.computeIfAbsent(road[1], k -> new ArrayList<>()).add(road[0]);
            degree[road[0]]++;
            degree[road[1]]++;
        }

        return bfs(n, adj, degree, seats);
    }

    private long bfs(int n, Map<Integer, List<Integer>> adj, int[] degree, int seats) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < n; i++) {
            if (degree[i] == 1) q.offer(i);
        }

        int[] representatives = new int[n];
        Arrays.fill(representatives, 1);
        long fuel = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            fuel += Math.ceil((double) representatives[node] / seats);

            for (int neighbour : adj.get(node)) {
                degree[neighbour]--;
                representatives[neighbour] += representatives[node];
                if (degree[neighbour] == 1 && neighbour != 0) q.offer(neighbour);
            }
        }

        return fuel;
    }
}