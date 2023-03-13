package kz.home.ys.algo.medium.designTicTacToe;

class TicTacToe {

    private int[] horizontal;
    private int[] vertical;
    private int diagonal;
    private int reverseDiagonal;
    private int n;

    public TicTacToe(int n) {
        this.n = n;
        horizontal = new int[n];
        vertical = new int[n];
        diagonal = 0;
        reverseDiagonal = 0;
    }
    
    // time - O(1)
    // space - O(N)
    public int move(int row, int col, int player) {
        int currentMovement = (player == 1) ? 1 : -1;
        horizontal[row] += currentMovement;
        vertical[col] += currentMovement;
        if (row == col) diagonal += currentMovement;
        if (row + col + 1 == n) reverseDiagonal += currentMovement;
        
        if (Math.abs(horizontal[row]) == n || Math.abs(vertical[col]) == n || Math.abs(diagonal) == n || Math.abs(reverseDiagonal) == n) return player;

        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */