package kz.home.ys.algo.easy.ransomNote;

import junit.framework.TestCase;

public class RansomNoteTest extends TestCase {

    public void testCanConstruct() {
        boolean canConstruct = new RansomNote().canConstruct("aa", "aab");

        assertTrue(canConstruct);
    }
}