package kz.home.ys.algo.hard.lastDayWhereYouCanStillCross;

import java.util.LinkedList;

class LastDayWhereYouCanStillCross {

        private final int[][] moves = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        public int latestDayToCross(int row, int col, int[][] cells) {
            int left = 1;
            int right = row * col;

            while (left < right) {
                int mid = right - (right - left) / 2;
                if (canCross(row, col, cells, mid)) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }

            return left;
        }

        private boolean canCross(int row, int col, int[][] cells, int day) {
            int[][] matrix = new int[row][col];
            LinkedList<int[]> deque = new LinkedList<>();

            for (int i = 0; i < day; i++) {
                matrix[cells[i][0] - 1][cells[i][1] - 1] = 1;
            }

            for (int j = 0; j < col; j++) {
                if (matrix[0][j] == 0) {
                    deque.addLast(new int[] {0, j});
                    matrix[0][j] = -1;
                }
            }

            while (!deque.isEmpty()) {
                int[] cell = deque.removeFirst();
                int currRow = cell[0], currCol = cell[1];

                if (currRow == row - 1) {
                    return true;
                }

                for (int[] move : moves) {
                    int nextRow = currRow + move[0];
                    int nextCol = currCol + move[1];
                    if (nextRow < 0 || nextCol < 0 || nextRow >= row || nextCol >= col || matrix[nextRow][nextCol] == 1 || matrix[nextRow][nextCol] == -1) continue;
                    matrix[nextRow][nextCol] = -1;
                    deque.addLast(new int[] {nextRow, nextCol});
                }
            }

            return false;
        }
}