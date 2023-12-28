package kz.home.ys.algo.medium.bombEnemy;

class BombEnemyWIthBruteForce {
    public int maxKilledEnemies(char[][] grid) {
        int maxKills = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '0') maxKills = Math.max(maxKills, countKills(row, col, grid));
            }
        }
        return maxKills;
    }

    private int countKills(int row, int col, char[][] grid) {
        int enemies = 0;
        int leftPos = col;
        while (leftPos >= 0) {
            int cell = grid[row][leftPos--];
            if (cell == 'W') break;
            else if (cell == 'E') enemies++;
        }
        int rightPos = col;
        while (rightPos < grid[0].length) {
            int cell = grid[row][rightPos++];
            if (cell == 'W') break;
            else if (cell == 'E') enemies++;
        }
        int upPos = row;
        while (upPos >= 0) {
            int cell = grid[upPos--][col];
            if (cell == 'W') break;
            else if (cell == 'E') enemies++;
        }
        int downPos = row;
        while (downPos < grid.length) {
            int cell = grid[downPos++][col];
            if (cell == 'W') break;
            else if (cell == 'E') enemies++;
        }
        return enemies;
    }
}