package kz.home.ys.algo.medium.gameOfLife;

import java.util.ArrayList;
import java.util.List;

class GameOfLife {
    public void gameOfLife(int[][] board) {
        /*
        
        1. DFS or BFS
        2. if we found dead which should be changed to live -> 3
        3. if we found live which should be changed to dead -> 4
        
        4. iterate again and change 3 to 1 and 4 to 0 
        

        time - O(2 * N*M) -> O(N*M)
        space - O(1)

        */

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int curr = board[i][j];
                List<int[]> neighbours = getNeighbours(board, i, j);
                int liveNeighboursCount = calculateNeighboursCount(board, neighbours);

                // Any live cell with fewer than two live neighbors dies as if caused by under-population.
                if (liveNeighboursCount < 2 && curr == 1) board[i][j] = 4;

                // Any live cell with two or three live neighbors lives on to the next generation.
                // if ((liveNeighboursCount == 2 || liveNeighboursCount == 3) && curr == 1) board[i][j] = 4;

                // Any live cell with more than three live neighbors dies, as if by over-population.
                if (liveNeighboursCount > 3 && curr == 1) board[i][j] = 4;

                // Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                if (liveNeighboursCount == 3 && curr == 0) board[i][j] = 3;
           }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 3) {
                    board[i][j] = 1;
                } else if (board[i][j] == 4) {
                    board[i][j] = 0;
                }
            }
        }
    }

    private List<int[]> getNeighbours(int[][] board, int i, int j) {
        int row = board.length;
        int col = board[0].length;
        List<int[]> neighbours = new ArrayList<>();
        if (i + 1 < row) neighbours.add(new int[] {i + 1, j});
        if (i - 1 >= 0) neighbours.add(new int[] {i - 1, j});
        if (j + 1 < col) neighbours.add(new int[] {i, j + 1});
        if (j - 1 >= 0) neighbours.add(new int[] {i, j - 1});
        if (i + 1 < row && j + 1 < col) neighbours.add(new int[] {i + 1, j + 1});
        if (i - 1 >= 0 && j - 1 >= 0) neighbours.add(new int[] {i - 1, j - 1});
        if (i + 1 < row && j - 1 >= 0) neighbours.add(new int[] {i + 1, j - 1});
        if (i - 1 >= 0 && j + 1 < col) neighbours.add(new int[] {i - 1, j + 1});
        return neighbours;
    }

    private int calculateNeighboursCount(int[][] board, List<int[]> neighbours) {
        int count = 0;
        for (int[] neighbour : neighbours) {
            int curr = board[neighbour[0]][neighbour[1]];
            if (curr == 4 || curr == 1) count++;
        }
        return count;
    }
}