package kz.home.ys.algo.easy.validWordSquare;

import java.util.List;

class ValidWordSquare {
    public boolean validWordSquare(List<String> words) {
        /* 
        
        Constraints:

        1 <= w.length <= 500
        1 <= w[i].length <= 500
        words[i] consists of only lowercase English letters.

        Approach:

        1. Create matrix
        2. iterate over the matrix and check whether col equals row

        time - O(NUMBER_OF_WORDS * MAX(WORD_LENGTH))
        space - O(NUMBER_OF_WORDS * MAX(WORD_LENGTH))
        
        */

        int matrixSize = words.size();
        for (String word : words) {
            matrixSize = Math.max(matrixSize, word.length());
        }

        char[][] matrix = new char[matrixSize][matrixSize];
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                matrix[i][j] = words.get(i).charAt(j);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            boolean areTheSameRowAndCol = compareRowAndColumn(matrix, i);
            if (!areTheSameRowAndCol) {
                return false;
            }
        }
        return true;
    }

    private boolean compareRowAndColumn(char[][] matrix, int idx) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (matrix[idx][i] != matrix[i][idx]) {
                return false;
            }
        }
        return true;
    }
}