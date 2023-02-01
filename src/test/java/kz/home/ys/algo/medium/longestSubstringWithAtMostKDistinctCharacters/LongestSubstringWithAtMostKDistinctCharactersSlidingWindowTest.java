package kz.home.ys.algo.medium.longestSubstringWithAtMostKDistinctCharacters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithAtMostKDistinctCharactersSlidingWindowTest   {

    @Test
    public void testLengthOfLongestSubstringKDistinct() {
        int result = new LongestSubstringWithAtMostKDistinctCharactersSlidingWindow().lengthOfLongestSubstringKDistinct("eceba", 2);

        assertEquals(3,result);
    }
}