package kz.home.ys.algo.easy.countNegativeNumbersInASortedMatrix;

class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        // time - O(M * log(N))
        // space - O(1)

        int n = grid[0].length;
        int result = 0;
        for (int[] row : grid) {
            int firstNegativeOccurrenceIdx = binarySearchFirstNegative(row);
            result += (n - firstNegativeOccurrenceIdx);
        }
        return result;
    }

    private int binarySearchFirstNegative(int[] row) {
        int l = 0;
        int r = row.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (row[m] < 0) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}