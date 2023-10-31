package kz.home.ys.algo.hard.perfectRectangle;

import java.util.HashSet;
import java.util.Set;

class PerfectRectangle {
    public boolean isRectangleCover(int[][] rectangles) {
        Set<String> points = new HashSet<>();
        int area = 0;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        for (int[] r : rectangles) {
            int x = r[0];
            int y = r[1];
            int a = r[2];
            int b = r[3];
            area += (x - a) * (y - b);
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxA = Math.max(maxA, a);
            maxB = Math.max(maxB, b);
            String bottomLeft = x + ":" + y;
            String topLeft = x + ":" + b;
            String bottomRight = a + ":" + y;
            String topRight = a + ":" + b;
            checkInSet(points, bottomLeft);
            checkInSet(points, topLeft);
            checkInSet(points, bottomRight);
            checkInSet(points, topRight);
        }
        String fullBottomLeft = minX + ":" + minY;
        String fullTopLeft = minX + ":" + maxB;
        String fullBottomRight = maxA + ":" + minY;
        String fullTopRight = maxA + ":" + maxB;
        if (points.size() != 4
                || !points.contains(fullBottomLeft)
                || !points.contains(fullTopLeft)
                || !points.contains(fullBottomRight)
                || !points.contains(fullTopRight))
            return false;
        int fullArea = (minX - maxA) * (minY - maxB);
        return area == fullArea;
    }

    private void checkInSet(Set<String> points, String point) {
        if (points.contains(point)) points.remove(point);
        else points.add(point);
    }
}