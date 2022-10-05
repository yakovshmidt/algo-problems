package kz.home.ys.algo.medium.validSudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ValidSudoku {

    // time - O(N^2)
    // space - O(N^2)
    public boolean isValidSudoku(char[][] board) {
        List<Set<Integer>> rows = new ArrayList<>(9);
        for (int row = 0; row < 9; row++) {
            rows.add(new HashSet<>());
        }
        List<Set<Integer>> cols = new ArrayList<>(9);
        for (int col = 0; col < 9; col++) {
            cols.add(new HashSet<>());
        }

        Set<Integer>[][] subGrids = new HashSet[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                subGrids[row][col] = new HashSet<>();
            }
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int cell = board[row][col];

                if (cell == '.') continue;

                if (rows.get(row).contains(cell)) return false;
                rows.get(row).add(cell);

                if (cols.get(col).contains(cell)) return false;
                cols.get(col).add(cell);

                if (subGrids[row / 3][col / 3].contains(cell)) return false;
                subGrids[row / 3][col / 3].add(cell);
            }
        }

        return true;
    }
}