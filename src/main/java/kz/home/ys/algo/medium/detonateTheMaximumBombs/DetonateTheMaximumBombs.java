package kz.home.ys.algo.medium.detonateTheMaximumBombs;

import java.util.*;

class DetonateTheMaximumBombs {
    public int maximumDetonation(int[][] bombs) {
        /*

        Constraints:
        * 1 <= bombs.length <= 100
        * 1 <= x, y, z <= 10^5
        
        Approach:
        1) create a graph
        2) traverse over the graph and find max depth

        Time: O(N^3)
        Space: O(N^2)

        */

        int n = bombs.length;
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] firstBomb = bombs[i];
                int[] secondBomb = bombs[j];

                if (isOverlapping(firstBomb, secondBomb)) {
                    graph.get(i).add(j);
                }

                if (isOverlapping(secondBomb, firstBomb)) {
                    graph.get(j).add(i);
                }
            }
        }

        int maxDepth = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxDepth = Math.max(maxDepth, getDepth(i, graph));
        }
        return maxDepth;
    }

    private int getDepth(int bombId, Map<Integer, Set<Integer>> graph) {
        LinkedList<Integer> deque = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        deque.addLast(bombId);
        visited.add(bombId);

        while (!deque.isEmpty()) {
            int currBombId = deque.removeFirst();
            for (int neighbour : graph.get(currBombId)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    deque.addLast(neighbour);
                }
            }
        }

        return visited.size();
    }

    private boolean isOverlapping(int[] firstBomb, int[] secondBomb) {
        int xi = firstBomb[0];
        int yi = firstBomb[1];
        int ri = firstBomb[2];

        int xj = secondBomb[0];
        int yj = secondBomb[1];

        return ((long) ri * ri >= (long) (xi - xj) * (xi - xj) + (long)(yi - yj) * (yi - yj));
    }
}






