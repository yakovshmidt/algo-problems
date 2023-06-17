package kz.home.ys.algo.medium.divideIntervalsIntoMinimumNumberOfGroups;

import java.util.Arrays;
import java.util.PriorityQueue;

class DivideIntervalsIntoMinimumNumberOfGroups {
    public int minGroups(int[][] intervals) {
        /* 
        
        Constraints:
        * 1 <= intervals.length <= 10^5
        * intervals[i].length == 2
        * 1 <= intervals[i][j] <= 10^6

        Approach:
        Input: intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]] -> [1,5],[1,10],[2,3],[5,10][6,8]
        1) sort the array
        2) 

        Time: O(N * Log(N))

        Space: O(N)
        
        */

        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            int prevEnd = minHeap.peek();
            int currStart = intervals[i][0];

            if (currStart > prevEnd) {
                minHeap.poll();
            }
            minHeap.add(intervals[i][1]);
        }

        return minHeap.size();
    }
}