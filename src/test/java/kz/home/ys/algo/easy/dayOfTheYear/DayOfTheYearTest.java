package kz.home.ys.algo.easy.dayOfTheYear;

import junit.framework.TestCase;

public class DayOfTheYearTest extends TestCase {

    public void testDayOfYear() {
        int dayOfYear = new DayOfTheYear().dayOfYear("2019-02-10");

        assertEquals(41, dayOfYear);
    }
}