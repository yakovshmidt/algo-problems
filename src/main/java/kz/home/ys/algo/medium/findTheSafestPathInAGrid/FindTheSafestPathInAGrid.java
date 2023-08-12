package kz.home.ys.algo.medium.findTheSafestPathInAGrid;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class FindTheSafestPathInAGrid {

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        List<int[]> thiefPositions = new ArrayList<>();

        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;

        int minDistanceToThief = Integer.MAX_VALUE;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid.get(row).get(col) == 1) {
                    thiefPositions.add(new int[] {row, col});
                    minDistanceToThief = Math.min(minDistanceToThief, row + col);
                }
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[2] - a[2]));
        pq.add(new int[] {0, 0, minDistanceToThief});

        if (grid.get(0).get(0) == 1 || grid.get(n - 1).get(n - 1) == 1) return 0;

        while (!pq.isEmpty()) {
            int[] currCell = pq.remove();
            int row = currCell[0];
            int col = currCell[1];

            if (row == n - 1 && col == n - 1) return currCell[2];

            int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            for (int[] direction : directions) {
                int newRow = direction[0] + row;
                int newCol = direction[1] + col;
                if (newRow < 0 || newCol < 0 || newRow >= n || newCol >= n || grid.get(newRow).get(newCol) == 1 || visited[newRow][newCol]) continue;
                int minDistance = Integer.MAX_VALUE;
                for (int[] thiefPosition : thiefPositions) {
                    int factor = Math.abs(newRow - thiefPosition[0]) + Math.abs(newCol - thiefPosition[1]);
                    minDistance = Math.min(minDistance, factor);
                }

                pq.add(new int[] {newRow, newCol, Math.min(minDistance, currCell[2])});
                visited[newRow][newCol] = true;
            }
        }

        return 0;
    }
}