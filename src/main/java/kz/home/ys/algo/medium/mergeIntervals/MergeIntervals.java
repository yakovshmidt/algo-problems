package kz.home.ys.algo.medium.mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MergeIntervals {

    // time - O(N*log(N) * N) -> O(N*log(N))
    // space - O(1)
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        
        List<int[]> result = new ArrayList<>();
        int l = 0;
        int r;
        while (l < intervals.length) {
            r = l + 1;
            int min = intervals[l][0];
            int max = intervals[l][1];
            while (r < intervals.length && intervals[r][0] >= min && intervals[r][0] <= max) {
                max = Math.max(max, intervals[r][1]);
                r++;
            }
            result.add(new int[] {min, max});
            l = r;
        }
        
        return result.toArray(new int[result.size()][2]);
    }
}