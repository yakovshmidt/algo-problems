package kz.home.ys.algo.medium.designTicTacToe;

class TicTacToeUsingMatrix {

    private final int[][] matrix;

    public TicTacToeUsingMatrix(int n) {
        matrix = new int[n][n];
    }

    // time - O(N^2)
    // space - O(N^2)
    public int move(int row, int col, int player) {
        matrix[row][col] = player;

        boolean wonByHorizontal = checkHorizontal(row, player);
        boolean wonByVertical = checkVertical(col, player);
        boolean wonByDiagonal = checkDiagonal(row, col, player);

        return (wonByHorizontal || wonByVertical || wonByDiagonal) ? player : 0;
    }

    private boolean checkHorizontal(int row, int player) {
        for (int i = 0; i < matrix.length; i++) {
            if (player != matrix[row][i]) return false;
        }
        return true;
    }

    private boolean checkVertical(int col, int player) {
        for (int[] ints : matrix) {
            if (player != ints[col]) return false;
        }
        return true;
    }

    private boolean checkDiagonal(int row, int col, int player) {
        if (row == col || Math.abs(row + col) == matrix.length) {
            boolean isWon = false;
            for (int i = 0; i < matrix.length; i++) {
                if (player == matrix[i][i]) {
                    isWon = true;
                } else {
                    isWon = false;
                    break;
                }
            }
            if (isWon) return true;

            for (int i = matrix.length - 1; i >= 0; i--) {
                if (player == matrix[matrix.length - 1 - i][i]) {
                    isWon = true;
                } else {
                    isWon = false;
                    break;
                }
            }

            return isWon;
        } else {
            return false;
        }
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */