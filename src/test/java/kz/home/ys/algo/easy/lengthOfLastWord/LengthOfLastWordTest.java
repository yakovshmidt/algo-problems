package kz.home.ys.algo.easy.lengthOfLastWord;

import junit.framework.TestCase;

public class LengthOfLastWordTest extends TestCase {

    public void testLengthOfLastWord() {
        int lengthOfLastWord = new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  ");

        assertEquals(4, lengthOfLastWord);
    }
}