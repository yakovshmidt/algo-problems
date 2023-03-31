package kz.home.ys.algo.graph.unionFindOrDisjointSet.quickFindDisjointSet;

public class QuickFindDisjointSet {

    private final int[] root;

    public QuickFindDisjointSet(int size) {
        root = new int[size];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }

    public int find(int idx) {
        return root[idx];
    }
}
