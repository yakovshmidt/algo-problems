package kz.home.ys.algo.medium.myCalendarI;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyCalendarITest {

    @Test
    public void testBook() {
        MyCalendarI myCalendarI = new MyCalendarI();

        assertTrue(myCalendarI.book(10, 20));
        assertFalse(myCalendarI.book(15, 25));
        assertTrue(myCalendarI.book(20, 30));
    }
}