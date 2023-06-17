package kz.home.ys.algo.easy.imageSmoother;

class ImageSmoother {

    private final static int[][] DIRS = {
        {-1, -1},
        {-1, 0},
        {-1, 1},
        {0, -1},
        {0, 1},
        {1, -1},
        {1, 0},
        {1, 1}
    };

    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                setAverageValue(i, j, m, n, img, result);
            }
        }

        return result;
    }

    private void setAverageValue(int i, int j, int m, int n, int[][] img, int[][] result) {
        int sum = img[i][j];
        int count = 1;

        for (int[] dir : DIRS) {
            if (isNotOutOfBound(i + dir[0], j + dir[1], m, n)) {
                sum += img[i + dir[0]][j + dir[1]];
                count++;
            }
        }

        result[i][j] = sum / count;
    }

    private boolean isNotOutOfBound(int i, int j, int m, int n) {
        return i >= 0 && j >= 0 && i < m && j < n;
    }
}