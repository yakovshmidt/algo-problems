package kz.home.ys.algo.medium.meetingRoomsII;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsIINeetCode {

    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        PriorityQueue<Integer> starts = new PriorityQueue<>(Comparator.comparingInt(it -> it));
        PriorityQueue<Integer> ends = new PriorityQueue<>(Comparator.comparingInt(it -> it));
        for (int[] interval : intervals) {
            starts.add(interval[0]);
            ends.add(interval[1]);
        }

        int requiredMeetingRooms = 0;
        int currMeetingRooms = 0;
        while (!starts.isEmpty()) {
            Integer start = starts.peek();
            Integer end = ends.peek();
            if (start < end) {
                currMeetingRooms++;
                starts.poll();
            } else {
                currMeetingRooms--;
                ends.poll();
            }

            requiredMeetingRooms = Math.max(requiredMeetingRooms, currMeetingRooms);
        }

        return requiredMeetingRooms;
    }
}