package kz.home.ys.algo.medium.courseScheduleIV;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLists;

public class CourseScheduleIVTest extends TestCase {

    public void testCheckIfPrerequisite() {
        List<Boolean> expected = List.of(false, true);

        List<Boolean> actual = new CourseScheduleIV().checkIfPrerequisite(2, new int[][]{{1, 0}}, new int[][]{{0, 1}, {1, 0}});

        assertLists(expected, actual);
    }
}