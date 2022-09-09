package kz.home.ys.algo.medium.meetingRoomsII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeetingRoomsIINeetCodeTest {

    @Test
    public void testMinMeetingRooms() {
        MeetingRoomsIINeetCode meetingRoomsIINeetCode = new MeetingRoomsIINeetCode();

        assertEquals(2, meetingRoomsIINeetCode.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
        assertEquals(1, meetingRoomsIINeetCode.minMeetingRooms(new int[][]{{2, 7}}));
        assertEquals(3, meetingRoomsIINeetCode.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}, {20, 25}, {19, 26}}));
    }
}