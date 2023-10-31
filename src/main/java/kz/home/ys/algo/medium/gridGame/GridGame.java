package kz.home.ys.algo.medium.gridGame;

import java.util.Arrays;

class GridGame {

    public long gridGame(int[][] grid) {
        long ans = Long.MAX_VALUE;
        long sum = Arrays.stream(grid[0]).asLongStream().sum();
        long pre = 0;

        for (int i = 0; i < grid[0].length; i++) {
            if (i > 0) {
                pre += grid[1][i - 1];
            }
            sum -= grid[0][i];
            ans = Math.min(ans, Math.max(pre, sum));
        }

        return ans;
    }
}