package kz.home.ys.algo.medium.minimumAreaRectangle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class MinimumAreaRectangle {
    public int minAreaRect(int[][] points) {
        if (points.length < 4) return 0;

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] point : points) {
            map.computeIfAbsent(point[0], o -> new HashSet<>()).add(point[1]);
        }
        
        int minRectangle = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = i + 1; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];

                if (x1 == x2 || y1 == y2) continue;

                if (map.get(x1).contains(y2) && map.get(x2).contains(y1)) {
                    minRectangle = Math.min(minRectangle, Math.abs(x2 - x1) * Math.abs(y2 - y1));                  
                }
            }

        }

        return minRectangle == Integer.MAX_VALUE ? 0 : minRectangle;
    }
}