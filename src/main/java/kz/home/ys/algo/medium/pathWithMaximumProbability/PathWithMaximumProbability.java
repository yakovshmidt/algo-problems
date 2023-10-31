package kz.home.ys.algo.medium.pathWithMaximumProbability;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class PathWithMaximumProbability {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map<Integer, Map<Integer, Double>> neighbours = new HashMap<>();
        for (int i = 0; i < n; i++) {
            neighbours.put(i, new HashMap<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            int from = edge[0];
            int to = edge[1];
            double probability = succProb[i];

            neighbours.get(from).put(to, probability);
            neighbours.get(to).put(from, probability);
        }

        double[] maxProb = new double[n];
        maxProb[start] = 1d;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (var entry : neighbours.get(curr).entrySet()) {
                int next = entry.getKey();
                double probability = entry.getValue();
                if (maxProb[curr] * probability > maxProb[next]) {
                    maxProb[next] = maxProb[curr] * probability;
                    queue.offer(next);
                }
            }
        }

        return maxProb[end];
    }
}