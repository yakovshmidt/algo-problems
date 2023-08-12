package kz.home.ys.algo.medium.longestSubstringWithAtMostTwoDistinctCharacters;

import junit.framework.TestCase;

public class LongestSubstringWithAtMostTwoDistinctCharactersTest extends TestCase {

    public void testLengthOfLongestSubstringTwoDistinct() {
        int result = new LongestSubstringWithAtMostTwoDistinctCharacters().lengthOfLongestSubstringTwoDistinct("eceba");

        assertEquals(3, result);
    }
}