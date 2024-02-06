package kz.home.ys.algo.hard.meetingRoomsIII;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MeetingRoomsIII {

    // Time - O(M*Log(M) + M*Log(N)) -> O(M*Log(M+N))
    // Space - O(M + N)
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(o -> o[0]));  // Time - O(M*Log(M))

        Queue<int[]> availableRooms = new PriorityQueue<>(Comparator.comparingInt(o -> o[0])); // Time - O(N*Log(N))
        for (int i = 0; i < n; i++) availableRooms.offer(new int[] {i, 0});

        Queue<int[]> busyRooms = new PriorityQueue<>((o1, o2) -> (o1[1] == o2[1]) ? (o1[2] - o2[2]) : (o1[1] - o2[1]));  // Time - O(M*Log(M))

        for (int[] meeting : meetings) {  // Time - O(M*Log(N))
            int start = meeting[0];
            while (!busyRooms.isEmpty() && busyRooms.peek()[1] <= start) {
                int[] finishedMeeting = busyRooms.poll();
                int room = finishedMeeting[2];
                int usedCount = finishedMeeting[3];
                availableRooms.offer(new int[] {room, usedCount});
            }

            int end = meeting[1];
            if (!availableRooms.isEmpty()) {
                int[] roomToUsedCount = availableRooms.poll();
                int room = roomToUsedCount[0];
                int usedCount = roomToUsedCount[1];
                busyRooms.offer(new int[] {start, end, room, usedCount + 1});
            } else {
                int[] prevMeeting = busyRooms.poll();
                int prevEnd = prevMeeting[1];
                int room = prevMeeting[2];
                int usedCount = prevMeeting[3];
                busyRooms.offer(new int[] {prevEnd, prevEnd + end - start, room, usedCount + 1});
            }
        }

        while (!busyRooms.isEmpty()) {
            int[] finishedMeeting = busyRooms.poll();
            int room = finishedMeeting[2];
            int usedCount = finishedMeeting[3];
            availableRooms.offer(new int[] {room, usedCount});
        }

        int maxUsedCount = 0;
        int roomId = 0;
        while (!availableRooms.isEmpty()) {
            int[] roomToUsedCount = availableRooms.poll();
            int room = roomToUsedCount[0];
            int usedCount = roomToUsedCount[1];
            if (usedCount > maxUsedCount) {
                maxUsedCount = usedCount;
                roomId = room;
            }
        }

        return roomId;
    }
}