package kz.home.ys.algo.easy.dayOfTheWeek;

import junit.framework.TestCase;

public class DayOfTheWeekTest extends TestCase {

    public void testDayOfTheWeek() {
        String dayOfTheWeek = new DayOfTheWeek().dayOfTheWeek(31, 8, 2019);

        assertEquals("Saturday", dayOfTheWeek);
    }
}