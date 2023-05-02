package kz.home.ys.algo.medium.takeKOfEachCharacterFromLeftAndRight;

import junit.framework.TestCase;

public class TakeKOfEachCharacterFromLeftAndRightTest extends TestCase {

    public void testTakeCharacters() {
        TakeKOfEachCharacterFromLeftAndRight takeKOfEachCharacterFromLeftAndRight = new TakeKOfEachCharacterFromLeftAndRight();

        assertEquals(8, takeKOfEachCharacterFromLeftAndRight.takeCharacters("aabaaaacaabc", 2));
        assertEquals(3, takeKOfEachCharacterFromLeftAndRight.takeCharacters("abc", 1));
    }
}