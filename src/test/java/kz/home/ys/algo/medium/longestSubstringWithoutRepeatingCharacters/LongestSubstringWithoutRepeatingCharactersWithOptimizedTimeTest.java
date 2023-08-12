package kz.home.ys.algo.medium.longestSubstringWithoutRepeatingCharacters;

import junit.framework.TestCase;

public class LongestSubstringWithoutRepeatingCharactersWithOptimizedTimeTest extends TestCase {

    public void testLengthOfLongestSubstring() {
        int result = new LongestSubstringWithoutRepeatingCharactersWithOptimizedTime().lengthOfLongestSubstring("abcabcbb");

        assertEquals(3, result);
    }
}