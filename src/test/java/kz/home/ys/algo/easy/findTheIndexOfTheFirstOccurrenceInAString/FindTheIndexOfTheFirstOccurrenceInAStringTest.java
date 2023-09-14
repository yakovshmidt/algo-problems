package kz.home.ys.algo.easy.findTheIndexOfTheFirstOccurrenceInAString;

import junit.framework.TestCase;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest extends TestCase {

    public void testStrStr() {
        int result = new FindTheIndexOfTheFirstOccurrenceInAString().strStr("sadbutsad", "sad");

        assertEquals(0, result);
    }
}