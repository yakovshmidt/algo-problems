package kz.home.ys.algo.medium.theEarliestMomentWhenEveryoneBecomeFriends;

import java.util.Arrays;
import java.util.Comparator;

class TheEarliestMomentWhenEveryoneBecomeFriends {
    public int earliestAcq(int[][] logs, int n) {
        /* 
        
        Approach:

        Union Find Problem

        Example: [[0,2,0],[1,0,1],[3,0,3],[4,1,2],[7,3,1]], n = 4

        int[] root with size 4 -> [0,1,2,3]

        iterate over logs matrix

        1. [20190101,0,1] -> union 0 and 1 -> root = [0, 0, 2, 3]
        
        root = [0,0,0,0]

        time - O(LOGS_SIZE * N) + O(N*log(N))
        space - O(N + N) -> O(2N) -> O(N)
        
        */
        Arrays.sort(logs, (log1, log2) -> {
            Integer tsp1 = log1[0];
            Integer tsp2 = log2[0];
            return tsp1.compareTo(tsp2);
        });

        UnionFind uf = new UnionFind(n);
        for (int[] log : logs) {
            int timestamp = log[0];
            int personOne = log[1];
            int personTwo = log[2];

            uf.union(personOne, personTwo);
            if (uf.count == 1) {
                return timestamp;
            }
        }

        return -1;
    }

    public static class UnionFind {
        public int[] root;
        public int[] rank;
        public int count;

        public UnionFind(int n) {
            root = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
                rank[i] = 1;
            }
            count = n;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (rank[rootX] < rank[rootY]) {
                    root[rootX] = rootY;
                } else if (rank[rootX] > rank[rootY]) {
                    root[rootY] = rootX;
                } else {
                    root[rootX] = rootY;
                    rank[rootY]++;
                }
                count--;
            }
        }

        // time - O(N)
        // space - O(N)
        public int find(int x) {
            if (root[x] == x) {
                return x;
            }
            return root[x] = find(root[x]);
        }
    }
}