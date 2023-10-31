package kz.home.ys.algo.medium.checkIfWordCanBePlacedInCrossword;

public class CheckIfWordCanBePlacedInCrossword {

    private char[][] board;
    String word;

    public boolean placeWordInCrossword(char[][] board, String word) {
        /*

        Constraints:
        1) 1 <= rows,cols <= 2 * 10^5
        2) 1 <= word.length <= max(rows, cols)

        Approach:
        1) using dsf for each cell try to add a word in four directions

        Time: O(ROW * COL * 4 * WORD)
        Space: O(ROW * COL)

        */
        this.board = board;
        this.word = word;

        for (int rowIdx = 0; rowIdx < board.length; rowIdx++) {
            for (int colIdx = 0; colIdx < board[0].length; colIdx++) {
                int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
                if (board[rowIdx][colIdx] == '#') continue;
                for (int[] direction : directions) {
                    if (canBePlaced(rowIdx, colIdx, direction)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean canBePlaced(int rowIdx, int colIdx, int[] direction) {
        int prevRowIdx = rowIdx - direction[0];
        int prevColIdx = colIdx - direction[1];
        if (prevRowIdx < 0 || prevRowIdx >= board.length || prevColIdx < 0 || prevColIdx >= board[0].length || board[prevRowIdx][prevColIdx] == '#') {

        } else {
            return false;
        }

        int afterLastRowIdx = rowIdx + word.length() + direction[0];
        int afterLastColIdx = colIdx + word.length() + direction[1];
        if (afterLastRowIdx < 0 || afterLastRowIdx >= board.length || afterLastColIdx < 0 || afterLastColIdx >= board[0].length || board[afterLastRowIdx][afterLastColIdx] == '#') {

        } else {
            return false;
        }

        int wordIdx = 0;
        boolean atLeastOneEmptyCell = false;
        while (wordIdx < word.length()) {
            if (rowIdx < 0 || rowIdx >= board.length || colIdx < 0 || colIdx >= board[0].length || board[rowIdx][colIdx] == '#') return false;
            if (board[rowIdx][colIdx] != ' ' && board[rowIdx][colIdx] != word.charAt(wordIdx)) return false;
            if (board[rowIdx][colIdx] == ' ') atLeastOneEmptyCell = true;
            rowIdx = rowIdx + direction[0];
            colIdx = colIdx + direction[1];
            wordIdx++;
        }
        return atLeastOneEmptyCell;
    }
}
