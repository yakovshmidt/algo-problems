package kz.home.ys.algo.medium.intervalListIntersections;

import java.util.ArrayList;
import java.util.List;

class IntervalListIntersections {

    // time - O(N + M)
    // space - O(1)
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        List<int[]> result = new ArrayList<>();
        while (i < firstList.length && j < secondList.length) {
            int[] first = firstList[i];
            int[] second = secondList[j];
            int lo = Math.max(first[0], second[0]);
            int hi = Math.min(first[1], second[1]);

            if (lo <= hi) {
                result.add(new int[] {lo, hi});
            }

            if (first[1] <= second[1]) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}