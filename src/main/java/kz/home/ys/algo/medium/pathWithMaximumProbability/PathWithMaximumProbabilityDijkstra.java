package kz.home.ys.algo.medium.pathWithMaximumProbability;

import kz.home.ys.algo.medium.maximumWidthOfBinaryTree.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class PathWithMaximumProbabilityDijkstra {

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

        PriorityQueue<Pair<Double, Integer>> maxHeap = new PriorityQueue<>((a, b) -> -Double.compare(a.getKey(), b.getKey()));
        maxHeap.add(new Pair<>(1.0, start));

        while (!maxHeap.isEmpty()) {
            Pair<Double, Integer> pair = maxHeap.poll();
            double currProb = pair.getKey();
            int curr = pair.getValue();
            if (curr == end) return currProb;

            for (var entry : neighbours.get(curr).entrySet()) {
                int next = entry.getKey();
                double nextProb = entry.getValue();
                if (currProb * nextProb > maxProb[next]) {
                    maxProb[next] = currProb * nextProb;
                    maxHeap.add(new Pair<>(maxProb[next], next));
                }
            }
        }

        return maxProb[end];
    }
}