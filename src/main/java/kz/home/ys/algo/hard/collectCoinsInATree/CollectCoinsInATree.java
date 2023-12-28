package kz.home.ys.algo.hard.collectCoinsInATree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CollectCoinsInATree {
    public int collectTheCoins(int[] coins, int[][] edges) {
        // get rid of non-coin leafs
        // get rid of coin leafs and their parents
        // count number of (nodes - 1) * 2
    
        List<Set<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            adj.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        List<Integer> leafs = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            int u = i;
            while (adj.get(u).size() == 1 && coins[u] == 0) {
                int v = adj.get(u).iterator().next();
                adj.get(u).remove(v);
                adj.get(v).remove(u);
                u = v;
            } 
            if (adj.get(u).size() == 1) {
                leafs.add(u);
            }
        }

        for (int sz = 2; sz > 0; sz--) {
            List<Integer> temp = new ArrayList<>();
            for (int u : leafs) {
                if (adj.get(u).size() == 1) {
                    int v = adj.get(u).iterator().next();
                    adj.get(u).remove(v);
                    adj.get(v).remove(u);
                    if (adj.get(v).size() == 1) temp.add(v);
                }
            }
            leafs = temp;
        }

        int ans = 0;
        for (int i = 0; i < coins.length; i++) {
            ans += adj.get(i).size();
        }
        return ans;
    }
}