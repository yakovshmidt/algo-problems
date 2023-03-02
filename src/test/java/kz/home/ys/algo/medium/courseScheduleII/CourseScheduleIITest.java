package kz.home.ys.algo.medium.courseScheduleII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseScheduleIITest {

    @Test
    public void testFindOrder() {
        int[] expected = new int[]{0, 2, 1, 3};

        int[] actual = new CourseScheduleII().findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    public static void main(String[] args) {
        //noinspection PointlessArithmeticExpression
        int v = ((int) 'A' - 64) * (int)Math.pow(26, 0);
        System.out.println(v);
    }
}