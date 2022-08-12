package kz.home.ys.algo.medium.nonOverlappingIntervals;

import java.util.Arrays;
import java.util.Comparator;

class NonOverlappingIntervals {
    // time - O(N*log(N))
    // space - O(N)
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int minNumberToRemove = 0;
        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            int prevEnd = intervals[i - 1][1];

            if (currStart < prevEnd) {
                intervals[i][1] = Math.min(prevEnd, currEnd);
                minNumberToRemove++;
            }
        }

        return minNumberToRemove;
    }
}































