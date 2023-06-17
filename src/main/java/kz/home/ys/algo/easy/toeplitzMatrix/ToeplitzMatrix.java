package kz.home.ys.algo.easy.toeplitzMatrix;

import java.util.LinkedList;
import java.util.List;

class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int totalRows = matrix.length;
        int totalColumns = matrix[0].length;

        // Initiate the linked list and add the first row to the linked list.
        List<Integer> linkedList = new LinkedList<>();
        for (int integer : matrix[0]) linkedList.add(integer);

        for (int row = 1; row < totalRows; row++) {
            // Check the row to see if any is not identical to the linked list elements.
            for (int column = 1; column < totalColumns; column++)
                if (matrix[row][column] != linkedList.get(column - 1))
                    return false;
            // Update the linked list for the next line.
            linkedList.remove(linkedList.size() - 1);
            linkedList.add(0, matrix[row][0]);
        }
        return true;
    }
}