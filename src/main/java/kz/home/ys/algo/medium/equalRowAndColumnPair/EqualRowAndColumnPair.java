package kz.home.ys.algo.medium.equalRowAndColumnPair;

import java.util.HashMap;
import java.util.Map;

class EqualRowAndColumnPair {
    public int equalPairs(int[][] grid) {
        /*
        
        Approach:
        1) take row 0 and compare with all columns
        2) take row 1 and ----||-----

        Time - O(N^2)
        Space - O(N^2)
        
        */
        int n = grid.length;

        Map<String, Integer> rows = new HashMap<>();
        for (int[] row : grid) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(row[j]);
                sb.append("-");
            }
            rows.put(sb.toString(), rows.getOrDefault(sb.toString(), 0) + 1);
        }
        
        Map<String, Integer> cols = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int[] row : grid) {
                sb.append(row[i]);
                sb.append("-");
            }
            cols.put(sb.toString(), cols.getOrDefault(sb.toString(), 0) + 1);
        }

        int numberOfEqualPairs = 0;
        for (var row : rows.entrySet()) {
            for (var col : cols.entrySet()) {
                if (row.getKey().equals(col.getKey())) {
                    numberOfEqualPairs += row.getValue() * col.getValue();
                }
            }
        }

        return numberOfEqualPairs;
    }
}