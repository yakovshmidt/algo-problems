package kz.home.ys.algo.medium.meetingRoomsII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeetingRoomsIIMinHeapTest {

    @Test
    public void testMinMeetingRooms() {
        MeetingRoomsIIMinHeap meetingRoomsIIMinHeap = new MeetingRoomsIIMinHeap();

        assertEquals(2, meetingRoomsIIMinHeap.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
        assertEquals(1, meetingRoomsIIMinHeap.minMeetingRooms(new int[][]{{2, 7}}));
        assertEquals(3, meetingRoomsIIMinHeap.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}, {20, 25}, {19, 26}}));
    }
}