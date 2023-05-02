package kz.home.ys.algo.medium.findAPeakElementII;

class FindAPeakElementIIBruteForce {
    public int[] findPeakGrid(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (isPeakElement(mat, i, j)) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }

    private boolean isPeakElement(int[][] mat, int i, int j) {
        int curr = mat[i][j];
        int up = (i - 1 < 0) ? -1 : mat[i - 1][j];
        int bottom = (i + 1 >= mat.length) ? -1 : mat[i + 1][j];
        int left = (j - 1 < 0) ? -1 : mat[i][j - 1];
        int right = (j + 1 >= mat[0].length) ? -1 : mat[i][j + 1];
        return (curr > up && curr > bottom && curr > left && curr > right);
    }
}