package kz.home.ys.algo.medium.meetingRoomsII;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsIIMinHeap {

    // time - O(N*log(N))
    // space - O(N)
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0])); // time - O(N*log(N))
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(it -> it));
        minHeap.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) { // time - O(N)
            int prevEnd = minHeap.peek();
            int currStart = intervals[i][0];

            if (currStart >= prevEnd) { // time - O(log(N))
                minHeap.poll();
            }
            minHeap.add(intervals[i][1]);
        }

        return minHeap.size();
    }
}