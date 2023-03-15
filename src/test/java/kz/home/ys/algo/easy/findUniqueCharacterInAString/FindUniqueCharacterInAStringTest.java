package kz.home.ys.algo.easy.findUniqueCharacterInAString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindUniqueCharacterInAStringTest   {

    @Test
    public void testFirstUniqChar() {
        int firstNonRepeatingCharactedIdx = new FindUniqueCharacterInAString().firstUniqChar("loveleetcode");

        assertEquals(2, firstNonRepeatingCharactedIdx);
    }
}