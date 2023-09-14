package kz.home.ys.algo.easy.findTheIndexOfTheFirstOccurrenceInAString;

import junit.framework.TestCase;

public class FindTheIndexOfTheFirstOccurrenceInAStringWithKMPTest extends TestCase {

    public void testStrStr() {
        int result = new FindTheIndexOfTheFirstOccurrenceInAStringWithKMP().strStr("onionionskys", "onions");

        assertEquals(3, result);
    }
}