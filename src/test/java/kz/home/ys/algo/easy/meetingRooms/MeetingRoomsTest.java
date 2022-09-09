package kz.home.ys.algo.easy.meetingRooms;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MeetingRoomsTest {

    @Test
    public void testCanAttendMeetings() {
        MeetingRooms meetingRooms = new MeetingRooms();

        assertFalse(
                meetingRooms.canAttendMeetings(
                        new ArrayList<>() {{
                            add(new Interval(0, 30));
                            add(new Interval(5, 10));
                            add(new Interval(10, 15));
                        }}
                )
        );

        assertTrue(
                meetingRooms.canAttendMeetings(
                        new ArrayList<>() {{
                            add(new Interval(0, 30));
                            add(new Interval(30, 40));
                            add(new Interval(41, 51));
                        }}
                )
        );

        assertTrue(
                meetingRooms.canAttendMeetings(
                        new ArrayList<>() {{
                            add(new Interval(2, 7));
                        }}
                )
        );
    }
}