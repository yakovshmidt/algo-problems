package kz.home.ys.algo.medium.shortestPathInBinaryMatrix;

import java.util.LinkedList;

class ShortestPathInBinaryMatrixSecondSolution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        /*
        
        Constraints:
        * NxN matrix
        * only 0 and 1 grid can contain
        * 1 <= n <= 100

        Approach: BFS
        1) we will use deque
        2) add top-left element in deque or recursion
            * if it is 0 -> continue;
            * else break;
        3) get all neighbours
        4) use only 0s
        5) during the process we will calculate number of steps made

        Time: O(N)

        Space: O(N)
        
        */

        if (grid[0][0] != 0) return -1;

        int n = grid.length;

        LinkedList<int[]> deque = new LinkedList<>();
        deque.addLast(new int[] {0, 0});
        boolean[][] visited = new boolean[n][n];

        int numberOfSteps = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            numberOfSteps++;
            while (size > 0) {
                int[] rowColPair = deque.removeFirst();
                size--;
                int row = rowColPair[0];
                int col = rowColPair[1];

                if (visited[row][col]) continue;
                visited[row][col] = true;

                if (row == n - 1 && col == n - 1) return numberOfSteps; 

                int[][] neighbours = getNeighbours(row, col);

                for (int[] neighbour : neighbours) {
                    int neighbourRowIdx = neighbour[0];
                    int neighbourColIdx = neighbour[1];

                    if (neighbourRowIdx < 0 || neighbourRowIdx >= n || neighbourColIdx < 0 || neighbourColIdx >= n || grid[neighbourRowIdx][neighbourColIdx] != 0 || visited[neighbourRowIdx][neighbourColIdx])
                        continue;

                    deque.addLast(neighbour);
                }
            }
        }

        return numberOfSteps;
    }

        private int[][] getNeighbours(int row, int col) {
            int[][] neighbours = new int[8][2];
            neighbours[0][0] = row + 1;
            neighbours[0][1] = col;

            neighbours[1][0] = row + 1;
            neighbours[1][1] = col - 1;

            neighbours[2][0] = row;
            neighbours[2][1] = col - 1;

            neighbours[3][0] = row - 1;
            neighbours[3][1] = col - 1;

            neighbours[4][0] = row - 1;
            neighbours[4][1] = col;

            neighbours[5][0] = row - 1;
            neighbours[5][1] = col + 1;

            neighbours[6][0] = row;
            neighbours[6][1] = col + 1;

            neighbours[7][0] = row + 1;
            neighbours[7][1] = col + 1;

            return neighbours;
        }
    }
