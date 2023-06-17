package kz.home.ys.algo.easy.findWinnerOnATicTacToeGame;

class FindWinnerOnATicTacToeGame {
    public String ticTacToe(int[][] moves) {
        int diagonal = 0;
        int reversedDiagonal = 0;
        int[] horizontal = new int[3];
        int[] vertical = new int[3];

        String result = "Pending";
        if (moves.length == 9) result = "Draw";

        int player = 1;
        for (int[] move : moves) {
            int row = move[0];
            int col = move[1];
            if (row == col) {
                diagonal += player;
                if (Math.abs(diagonal) == 3) return player == 1 ? "A" : "B";
            } 
            if ((row == (2 - col)) || ((2 - row) == col)) {
                reversedDiagonal += player;
                if (Math.abs(reversedDiagonal) == 3) return player == 1 ? "A" : "B";
            }

            horizontal[row] += player;
            if (Math.abs(horizontal[row]) == 3) return player == 1 ? "A" : "B";

            vertical[col] += player;
            if (Math.abs(vertical[col]) == 3) return player == 1 ? "A" : "B";

            player = -player;
        }
        return result;
    }
}