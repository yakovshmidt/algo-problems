package kz.home.ys.algo.medium.search2DMatrixII;

class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int colIdx = findColIdx(matrix, target);

        return findTarget(matrix, target, colIdx);
    }

    private int findColIdx(int[][] matrix, int target) {
        int l = 0;
        int r = matrix[0].length - 1;
        while (l != r) {
            int m = l + (r - l) / 2;

            int mid = matrix[0][m];
            if (mid == target) return mid;
            else if (target > mid) l = m + 1;
            else r = m - 1;
        }
        return l;
    }

     private boolean findTarget(int[][] matrix, int target, int colIdx) {
        int l = 0;
        int r = matrix.length - 1;
        while (l != r) {
            int m = l + (r - l) / 2;
            int mid = matrix[m][colIdx];
            if (target == mid) return true;
            else if (target > mid) l = m + 1;
            else r = m - 1;
        }
        return matrix[l][colIdx] == target;
    }
}