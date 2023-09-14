package kz.home.ys.algo.hard.minimumCostToMakeAtLeastOneValidPathInAGrid;

import java.util.*;

class MinimumCostToMakeAtLeastOneValidPathInAGrid {

    private int m;
    private int n;
    private int[][] moves;
    private boolean[][] visited;

    // time - O(M*N)
    // space - O(M*N)
    public int minCost(int[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.moves = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        this.visited = new boolean[this.m][this.n];

        Deque<int[]> deque = new ArrayDeque<>();
        deque.push(new int[]{0, 0, 0});  // row, col, cost

        int minCost = Integer.MAX_VALUE;
        while (!deque.isEmpty()) {
            int[] cell = deque.removeFirst();
            int row = cell[0], col = cell[1];

            if (visited[row][col]) continue;
            visited[row][col] = true;

            if (isBottomRightCell(row, col)) {
                minCost = Math.min(minCost, cell[2]);
                continue;
            }

            int direction = grid[row][col];
            int[] nextCell = new int[]{row + moves[direction - 1][0], col + moves[direction - 1][1], cell[2]};

            for (int[] neighbour : getNeighbours(row, col)) {
                if (areSameCells(nextCell, neighbour)) {
                    deque.addFirst(nextCell);
                } else {
                    deque.addLast(new int[]{neighbour[0], neighbour[1], cell[2] + 1});
                }
            }
        }

        return minCost;
    }

    private boolean isBottomRightCell(int row, int col) {
        return row == m - 1 && col == n - 1;
    }

    private List<int[]> getNeighbours(int row, int col) {
        List<int[]> neighbours = new ArrayList<>();
        for (int[] move : this.moves) {
            int nextRow = row + move[0];
            int nextCol = col + move[1];

            if (nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n && !visited[nextRow][nextCol]) {
                neighbours.add(new int[]{nextRow, nextCol});
            }
        }
        return neighbours;
    }

    private boolean areSameCells(int[] firstCell, int[] secondCell) {
        return firstCell[0] == secondCell[0] && firstCell[1] == secondCell[1];
    }
}