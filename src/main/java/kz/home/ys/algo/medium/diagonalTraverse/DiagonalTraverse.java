package kz.home.ys.algo.medium.diagonalTraverse;

import java.util.LinkedList;

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        /*
        
        Constraints:
        * 1 <= m, n <= 10^4
        * -10^5 <= mat[i][j]

        Approach:
        * BFS
        1) take 0,0 and add from right to left, add 0,1 and 1.0

        1,0 - 0,1

        2) change direction
        3)  

        1,0 - 0,1

        0,1 -> 0,2 - 1,1

        Time:

        Space:
        
        */

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;

        LinkedList<int[]> deque = new LinkedList<>();
        deque.add(new int[] {0, 0});
        boolean moveRight = true;
        int[] prev = new int[] {-1, -1};
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size > 0) {
                if (moveRight) {
                    int[] rowToCol = deque.removeFirst();
                    if (rowToCol[0] == prev[0] && rowToCol[1] == prev[1]) {
                        size--;
                        continue;
                    }
                    prev = rowToCol;
                    int row = rowToCol[0];
                    int col = rowToCol[1];

                    result[idx++] = mat[row][col];

                    if (row + 1 < m) {
                        int[] left = new int[] {row + 1, col};
                        deque.addLast(left);
                    }
                    if (col + 1 < n) {
                        int[] right = new int[] {row, col + 1};
                        deque.addLast(right);
                    }
                } else {
                    int[] rowToCol = deque.removeLast();
                    if (rowToCol[0] == prev[0] && rowToCol[1] == prev[1]) {
                        size--;
                        continue;
                    }
                    prev = rowToCol;
                    int row = rowToCol[0];
                    int col = rowToCol[1];

                    result[idx++] = mat[row][col];

                    if (col + 1 < n) {
                        int[] right = new int[] {row, col + 1};
                        deque.addFirst(right);
                    }
                    if (row + 1 < m) {
                        int[] left = new int[] {row + 1, col};
                        deque.addFirst(left);
                    }
                }
                size--;
            }
            moveRight = !moveRight;
        }
        return result;
    }
}