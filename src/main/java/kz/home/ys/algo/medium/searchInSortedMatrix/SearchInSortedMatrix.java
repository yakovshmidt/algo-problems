package kz.home.ys.algo.medium.searchInSortedMatrix;

class SearchInSortedMatrix {

    // time - O(N + M)
    // space - O(1)
    public int[] searchInSortedMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] > target) {
                column--;
            } else if (matrix[row][column] < target) {
                row++;
            } else {
                return new int[] {row, column};
            }
        }
        return new int[]{-1, -1};
    }
}

