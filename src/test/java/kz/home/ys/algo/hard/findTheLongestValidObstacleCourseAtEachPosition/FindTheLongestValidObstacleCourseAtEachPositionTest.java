package kz.home.ys.algo.hard.findTheLongestValidObstacleCourseAtEachPosition;

import junit.framework.TestCase;

public class FindTheLongestValidObstacleCourseAtEachPositionTest extends TestCase {

    public void testLongestObstacleCourseAtEachPosition() {
        int[] expected = new int[] {1,2,3,3};

        int[] actual = new FindTheLongestValidObstacleCourseAtEachPosition().longestObstacleCourseAtEachPosition(new int[]{1, 2, 3, 2});

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}