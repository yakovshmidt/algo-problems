package kz.home.ys.algo.medium.findTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance;

import java.util.*;

public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Map<Integer, Map<Integer, Integer>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            int weight = edge[2];

            adj.putIfAbsent(node1, new HashMap<>());
            adj.putIfAbsent(node2, new HashMap<>());
            adj.get(node1).put(node2, weight);
            adj.get(node2).put(node1, weight);
        }

        Map<Integer, Set<Integer>> thresholdNeighbours = new HashMap<>();
        for (int i = 0; i < n; i++) {
            thresholdNeighbours.put(i, new HashSet<>());
            Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
            queue.add(new int[] {i, 0});
            while (!queue.isEmpty()) {
                int[] nodeToWeight = queue.remove();
                int currNode = nodeToWeight[0];
                int currWeight = nodeToWeight[1];

                if (currNode != i) {
                    thresholdNeighbours.get(i).add(currNode);
                }

                Map<Integer, Integer> neighboursToWeights = adj.get(currNode);
                if (neighboursToWeights == null) continue;
                for (var neighbourToWeight : neighboursToWeights.entrySet()) {
                    int neighbour = neighbourToWeight.getKey();
                    int weight = neighbourToWeight.getValue();

                    if (currWeight + weight <= distanceThreshold && !thresholdNeighbours.getOrDefault(i, new HashSet<>()).contains(neighbour)) {
                        queue.add(new int[] {neighbour, currWeight + weight});
                    }
                }
            }
        }

        int minSize = Integer.MAX_VALUE;
        int answer = -1;
        for (int i = 0; i < thresholdNeighbours.size(); i++) {
            int currSize = thresholdNeighbours.get(i).size();
            minSize = Math.min(minSize, currSize);
            if (minSize == currSize) {
                if (i > answer) answer = i;
            }
        }

        return answer;
    }
}
