package kz.home.ys.algo.medium.myCalendarI;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyCalendarIUsingTreeSetTest {

    @Test
    public void testBook() {
        MyCalendarIUsingTreeSet myCalendarI = new MyCalendarIUsingTreeSet();

        assertTrue(myCalendarI.book(47, 50));
        assertTrue(myCalendarI.book(33, 41));
        assertFalse(myCalendarI.book(39, 45));
        assertFalse(myCalendarI.book(33, 42));
    }
}