package kz.home.ys.algo.easy.reverseWordsInAStringIII;

import junit.framework.TestCase;

public class ReverseWordsInAStringIIITest extends TestCase {

    public void testReverseWords() {
        String expected = "s'teL ekat edoCteeL tsetnoc";

        String actual = new ReverseWordsInAStringIII().reverseWords("Let's take LeetCode contest");

        assertEquals(expected, actual);
    }
}