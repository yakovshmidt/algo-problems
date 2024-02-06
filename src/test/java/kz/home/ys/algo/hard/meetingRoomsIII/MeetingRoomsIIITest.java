package kz.home.ys.algo.hard.meetingRoomsIII;

import junit.framework.TestCase;

public class MeetingRoomsIIITest extends TestCase {

    public void testMostBooked() {
        int result = new MeetingRoomsIII().mostBooked(3, new int[][]{{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}});

        assertEquals(1, result);
    }
}