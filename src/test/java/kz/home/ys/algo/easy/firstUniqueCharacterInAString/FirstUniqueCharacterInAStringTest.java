package kz.home.ys.algo.easy.firstUniqueCharacterInAString;

import junit.framework.TestCase;

public class FirstUniqueCharacterInAStringTest extends TestCase {

    public void testFirstUniqChar() {
        int result = new FirstUniqueCharacterInAString().firstUniqChar("leetcode");

        assertEquals(0, result);
    }
}