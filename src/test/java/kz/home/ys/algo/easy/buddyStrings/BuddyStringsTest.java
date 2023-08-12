package kz.home.ys.algo.easy.buddyStrings;

import junit.framework.TestCase;

public class BuddyStringsTest extends TestCase {

    public void testBuddyStrings() {
        boolean isBuddyString = new BuddyStrings().buddyStrings("aa", "aa");

        assertTrue(isBuddyString);
    }
}