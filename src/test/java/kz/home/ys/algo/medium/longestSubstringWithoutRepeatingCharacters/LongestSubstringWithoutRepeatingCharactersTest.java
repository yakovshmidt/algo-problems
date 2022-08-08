package kz.home.ys.algo.medium.longestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring() {
        int longestSubstring = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew");

        assertEquals(3, longestSubstring);
    }
}