package kz.home.ys.algo.medium.spiralMatrix;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    
    // time - O(N*M)
    // space - O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>((matrix.length - 1) * (matrix[0].length - 1));
        
        int row = 0;
        int col = 0;
        while (row <= rowEnd && col <= colEnd) {
            for (int c = col; c <= colEnd; c++) result.add(matrix[row][c]);
            for (int r = row + 1; r <= rowEnd; r++) result.add(matrix[r][colEnd]);

            if (row < rowEnd && col < colEnd) {
                for (int c = colEnd - 1; c >= col; c--) result.add(matrix[rowEnd][c]);
                for (int r = rowEnd - 1; r >= row + 1; r--) result.add(matrix[r][col]);
            }
                
            row++;
            col++;
            rowEnd--;
            colEnd--;
        }
        
        return result;
    }
}