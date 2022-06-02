package kz.home.ys.algo.medium.insertIntervals;

import java.util.ArrayList;
import java.util.List;

class InsertIntervals {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][] {newInterval};
        
        int idx = 0;
        List<int[]> result = new ArrayList<>();
        while (idx < intervals.length && intervals[idx][1] < newInterval[0]) {
            result.add(intervals[idx++]);
        }
        
        while (idx < intervals.length && intervals[idx][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[idx][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[idx][1]);
            idx++;
        }
        result.add(newInterval);
        
        while (idx < intervals.length) {
            result.add(intervals[idx++]);
        }
        
        return result.toArray(new int[result.size()][2]);
    }
}