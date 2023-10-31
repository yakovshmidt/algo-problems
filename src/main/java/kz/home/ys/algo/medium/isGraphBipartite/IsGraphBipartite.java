package kz.home.ys.algo.medium.isGraphBipartite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

class IsGraphBipartite {

    // time - O(N + V)
    // space - O(N)
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                color[i] = 0;
                while (!stack.isEmpty()) {
                    int node = stack.pop();
                    for (int neighbour : graph[node]) {
                        if (color[neighbour] == -1) {
                            stack.push(neighbour);
                            color[neighbour] = color[node] ^ 1;
                        } else if (color[neighbour] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;        
    }
}