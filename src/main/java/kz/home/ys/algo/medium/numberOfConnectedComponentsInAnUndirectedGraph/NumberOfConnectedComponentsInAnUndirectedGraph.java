package kz.home.ys.algo.medium.numberOfConnectedComponentsInAnUndirectedGraph;

import java.util.HashSet;
import java.util.Set;

class NumberOfConnectedComponentsInAnUndirectedGraph {

    private int[] root;
    private int[] rank;
    private int count;

    public int countComponents(int n, int[][] edges) {
        /*

        n = 5, edges = [[0,1],[1,2],[3,4]]

        Approach 1 (connect node)

        [0,1,2]
        [3,4]

        time - O(N^2)
        space - O(1)

        Approach 2 (Union find)

        1. int[] root = [0, 1, 2, 3, 4]
        2. connect 0 and 1 -> root = [0, 0, 2, 3, 4]
        3. connect 1 and 2 -> root = [0, 0, 0, 3, 4]
        4. connect 3 and 4 -> root = [0, 0, 0, 3, 3]
        5. get unique amount in root -> 2

        time -
            Union - O(1)
            Find - O(N)
        space - O(N)

        */

        root = new int[n];
        rank = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            root[i] = i;
            rank[i] = 1;
        }

        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }

        return count;
    }

    private void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else {
                root[rootY] = rootX;
                rank[rootX]++;
            }
            count--;
        }
    }

    private int find(int x) {
        if (x == root[x]) return x;
        return root[x] = find(root[x]);
    }
}