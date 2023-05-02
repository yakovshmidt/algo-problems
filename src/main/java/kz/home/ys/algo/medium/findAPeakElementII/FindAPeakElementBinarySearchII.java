package kz.home.ys.algo.medium.findAPeakElementII;

class FindAPeakElementBinarySearchII {

    // time - O(N*log(M))
    // space - O(1)
    public int[] findPeakGrid(int[][] mat) {
        int l = 0;
        int r = mat[0].length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int maxRow = 0;
            for (int i = 0; i < mat.length; i++) {
                if (mat[maxRow][m] < mat[i][m]) maxRow = i;
            }

            if ((m == 0 || mat[maxRow][m - 1] < mat[maxRow][m]) && (m == mat[0].length - 1 || mat[maxRow][m + 1] < mat[maxRow][m])) {
                return new int[] {maxRow, m};
            } else if (m > 0 && mat[maxRow][m] < mat[maxRow][m - 1]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return new int[] {-1, -1};
    }
}