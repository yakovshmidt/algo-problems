package kz.home.ys.algo.medium.numberOfProvinces;

public class NumberOfProvincesWithRankedDisjointSet {

        public int findCircleNum(int[][] isConnected) {
            int n = isConnected.length;
            UnionFind unionFind = new UnionFind(n);
            for (int i = 0; i < isConnected.length; i++) {
                for (int j = 0; j < isConnected[i].length; j++) {
                    if (isConnected[i][j] == 1) {
                        unionFind.union(i, j);
                    }
                }
            }

            return unionFind.getCount();
        }

        private static class UnionFind {

            private final int[] rank;
            private final int[] root;
            private int count;

            public UnionFind(int n) {
                rank = new int[n];
                root = new int[n];
                count = n;

                for (int i = 0; i < n; i++) {
                    root[i] = i;
                    rank[i] = 1;
                }
            }

            private int find(int x) {
                if (root[x] == x) {
                    return x;
                }

                return root[x] = find(root[x]);
            }

            public void union(int x, int y) {
                int rootX = find(x);
                int rootY = find(y);

                if (rootX != rootY) {
                    if (rank[rootX] > rank[rootY]) {
                        root[rootY] = rootX;
                    } else if (rank[rootX] < rank[rootY]) {
                        root[rootX] = rootY;
                    } else {
                        root[rootY] = rootX;
                        rank[rootX]++;
                    }
                    count--;
                }
            }

            public int getCount() {
                return count;
            }
        }
}
