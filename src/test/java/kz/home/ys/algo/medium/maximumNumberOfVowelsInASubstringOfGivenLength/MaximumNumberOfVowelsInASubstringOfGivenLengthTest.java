package kz.home.ys.algo.medium.maximumNumberOfVowelsInASubstringOfGivenLength;

import junit.framework.TestCase;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest extends TestCase {

    public void testMaxVowels() {
        int vowels = new MaximumNumberOfVowelsInASubstringOfGivenLength().maxVowels("abciiidef", 3);

        assertEquals(3, vowels);
    }
}