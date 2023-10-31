package kz.home.ys.algo.medium.maximumWhiteTilesCoveredByACarpet;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumWhiteTilesCoveredByACarpet {

    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, Comparator.comparingInt(o -> o[0]));
        int n = tiles.length;
        int[] prefixSum = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            prefixSum[i] = (i > 0 ? prefixSum[i - 1] : 0) + tiles[i][1] - tiles[i][0] + 1;
        }
        for (int i = 0; i < n; i++) {
            int end = tiles[i][0] + carpetLen - 1;
            int idx = binarySearch(tiles, end, i, n - 1);
            int sum = prefixSum[idx] - (i > 0 ? prefixSum[i - 1] : 0);
            if (end < tiles[idx][1]) {
                sum -= tiles[idx][1] - end;
            }
            max = Math.max(max, sum);
        }

        return max;
    }

    private int binarySearch(int[][] tiles, int target, int start, int end) {
        while (end - start > 1) {
            int mid = start + (end - start) / 2;
            if (tiles[mid][1] >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (tiles[end][0] <= target) {
            return end;
        }
        return start;
    }
}
