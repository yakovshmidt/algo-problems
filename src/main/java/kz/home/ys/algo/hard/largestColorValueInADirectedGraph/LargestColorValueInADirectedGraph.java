package kz.home.ys.algo.hard.largestColorValueInADirectedGraph;

import java.util.*;

class LargestColorValueInADirectedGraph {

    // time - O(26*M + 26*N)
    // space - O(M + 26*N)
    public int largestPathValue(String colors, int[][] edges) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int n = colors.length();
        int[] inDegree = new int[n];

        for (int[] edge : edges) {
            adj.putIfAbsent(edge[0], new ArrayList<>());
            adj.get(edge[0]).add(edge[1]);
            inDegree[edge[1]]++;
        }

        int[][] count = new int[n][26];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) queue.add(i);
        }

        int answer = 1, nodesSeen = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            answer = Math.max(answer, ++count[node][colors.charAt(node) - 'a']);
            nodesSeen++;

            if (!adj.containsKey(node)) continue;

            for (int neighbour : adj.get(node)) {
                for (int i = 0; i < 26; i++) {
                    count[neighbour][i] = Math.max(count[neighbour][i], count[node][i]);
                }

                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }

        return nodesSeen < n ? -1 : answer;
    }
}