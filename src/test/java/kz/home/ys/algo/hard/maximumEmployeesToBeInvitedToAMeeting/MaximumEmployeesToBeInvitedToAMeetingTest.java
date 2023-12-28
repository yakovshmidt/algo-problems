package kz.home.ys.algo.hard.maximumEmployeesToBeInvitedToAMeeting;

import junit.framework.TestCase;

public class MaximumEmployeesToBeInvitedToAMeetingTest extends TestCase {

    public void testMaximumInvitations() {
        int result = new MaximumEmployeesToBeInvitedToAMeeting().maximumInvitations(new int[]{2, 2, 1, 2});

        assertEquals(3, result);
    }
}