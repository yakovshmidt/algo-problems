package kz.home.ys.algo.medium.longestRepeatingCharacterReplacement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestRepeatingCharacterReplacementTest {

    @Test
    public void testCharacterReplacement() {
        int result = new LongestRepeatingCharacterReplacement().characterReplacement("AABABBA", 1);

        assertEquals(4, result);
    }
}