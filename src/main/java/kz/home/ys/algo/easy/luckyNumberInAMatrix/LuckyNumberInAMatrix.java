package kz.home.ys.algo.easy.luckyNumberInAMatrix;

import java.util.ArrayList;
import java.util.List;

class LuckyNumberInAMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int[] row : matrix) {
            int minRowElement = Integer.MAX_VALUE; // 3
            int minRowElementIdx = -1; // 0
            for (int j = 0; j < row.length; j++) {
                if (minRowElement > row[j]) {
                    minRowElement = row[j];
                    minRowElementIdx = j;
                }
            }

            int maxColElement = Integer.MIN_VALUE;
            for (int[] r : matrix) {
                if (maxColElement < r[minRowElementIdx]) {
                    maxColElement = r[minRowElementIdx];
                }
            }

            if (minRowElement == maxColElement) {
                result.add(minRowElement);
            }
        }
        return result;
    }
}