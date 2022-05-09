package kz.home.ys.algo.medium.search2DMatrix;

class Search2DMatrix {

    // time - O(log(N) + log(M))
    // space - O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int row = getRow(matrix, target, rows);

        if (targetNotInRowRange(matrix, target, row)) return false;

        return binarySearch(matrix, target, columns, row);
    }

    private boolean binarySearch(int[][] matrix, int target, int columns, int row) {
        int l = 0;
        int r = columns - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target < matrix[row][mid]) {
                r = mid - 1;
            } else if (target > matrix[row][mid]) {
                l = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    private boolean targetNotInRowRange(int[][] matrix, int target, int row) {
        return !(matrix[row][0] <= target && target <= matrix[row][matrix[0].length - 1]);
    }

    private int getRow(int[][] matrix, int target, int rows) {
        int top = 0;
        int bottom = rows - 1;
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else if (target > matrix[mid][matrix[0].length - 1]) {
                top = mid + 1;
            } else {
                break;
            }
        }

        return (bottom + top) / 2;
    }
}