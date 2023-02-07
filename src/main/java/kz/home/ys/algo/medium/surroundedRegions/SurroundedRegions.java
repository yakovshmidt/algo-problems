package kz.home.ys.algo.medium.surroundedRegions;

import java.util.Stack;

class SurroundedRegions {

    // time - O(N)
    // space - O(N)
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') markAsNotFlipped(board, i, 0);
            if (board[i][cols - 1] == 'O') markAsNotFlipped(board, i, cols - 1);
        }
        for (int i = 0; i < cols; i++) {
            if (board[0][i] == 'O') markAsNotFlipped(board, 0, i);
            if (board[rows - 1][i] == 'O') markAsNotFlipped(board, rows - 1, i);
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 'N') {
                    board[r][c] = 'O';
                } else if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                }
            }
        }
    }

    private void markAsNotFlipped(char[][] board, int row, int col) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] {row, col});
        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            row = curr[0];
            col = curr[1];
            board[row][col] = 'N';
            if (row - 1 >= 0 && board[row - 1][col] == 'O') stack.push(new int[] {row - 1, col});
            if (row + 1 < board.length && board[row + 1][col] == 'O') stack.push(new int[] {row + 1, col});
            if (col - 1 >= 0 && board[row][col - 1] == 'O') stack.push(new int[] {row, col - 1});
            if (col + 1 < board[0].length && board[row][col + 1] == 'O') stack.push(new int[] {row, col + 1});
        }
    }
}