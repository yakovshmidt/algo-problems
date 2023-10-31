package kz.home.ys.algo.medium.findAndReplaceInString;

import junit.framework.TestCase;

public class FindAndReplaceInStringTest extends TestCase {

    public void testFindReplaceString1() {
        String result = new FindAndReplaceInString()
                .findReplaceString("vmokgggqzp", new int[]{3, 5, 1}, new String[]{"kg", "ggq", "mo"}, new String[]{"s", "so", "bfr"});

        assertEquals("vbfrssozp", result);
    }

    public void testFindReplaceString2() {
        String result = new FindAndReplaceInString()
                .findReplaceString("abcd", new int[]{0,2}, new String[]{"ab","ec"}, new String[]{"eee","ffff"});

        assertEquals("eeecd", result);
    }
}