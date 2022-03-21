package kz.home.ys.algo.hard.dijkstrasAlgorithm;

import java.util.*;

class DijkstrasAlgorithm {

    // time - O(V + E) - where V is length of vertices and E is length of edges
    // space - O((V(length of minDistances array) + V(length of visited array)) * M) -> O(V) - where V is number of vertices and M is local recursion stack
    public int[] dijkstrasAlgorithm(int start, int[][][] edges) {
        int[] minDistances = new int[edges.length];
        Arrays.fill(minDistances, -1);
        minDistances[start] = 0;
        boolean[] visited = new boolean[edges.length];

        calculateMinDistances(edges, start, minDistances, visited);

        return minDistances;
    }

    private void calculateMinDistances(int[][][] edges,
                                       int currVertexIdx,
                                       int[] minDistances,
                                       boolean[] visited) {
        if (visited[currVertexIdx]) return;
        visited[currVertexIdx] = true;
        for (int[] edge : edges[currVertexIdx]) {
            int destination = edge[0];
            int distance = edge[1];

            int minDistance = minDistances[destination];
            if (minDistance == -1) {
                minDistances[destination] = distance + minDistances[currVertexIdx];
            } else {
                minDistances[destination] = Math.min(
                        minDistances[destination],
                        distance + minDistances[currVertexIdx]
                );
            }
        }
        for (int[] edge : edges[currVertexIdx]) {
            calculateMinDistances(edges, edge[0], minDistances, visited);
        }
    }
}

