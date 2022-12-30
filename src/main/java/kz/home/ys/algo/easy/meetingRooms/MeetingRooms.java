package kz.home.ys.algo.easy.meetingRooms;

import java.util.Comparator;
import java.util.List;

public class MeetingRooms {

    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(it -> it.start));

        for (int i = 1; i < intervals.size(); i++) {
            Interval prev = intervals.get(i - 1);
            Interval curr = intervals.get(i);

            if (curr.start < prev.end) {
                return false;
            }
        }

        return true;
    }
}