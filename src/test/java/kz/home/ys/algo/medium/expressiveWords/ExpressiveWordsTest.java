package kz.home.ys.algo.medium.expressiveWords;

import junit.framework.TestCase;

public class ExpressiveWordsTest extends TestCase {

    public void testExpressiveWords1() {
        int result = new ExpressiveWords().expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"});

        assertEquals(1, result);
    }

    public void testExpressiveWords2() {
        int result = new ExpressiveWords().expressiveWords("zzzzzyyyyy", new String[]{"zzyy","zy","zyy"});

        assertEquals(3, result);
    }
}