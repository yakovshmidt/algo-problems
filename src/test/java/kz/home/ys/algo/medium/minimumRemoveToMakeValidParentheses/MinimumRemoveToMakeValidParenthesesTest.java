package kz.home.ys.algo.medium.minimumRemoveToMakeValidParentheses;

import junit.framework.TestCase;

public class MinimumRemoveToMakeValidParenthesesTest extends TestCase {

    public void testMinRemoveToMakeValid() {
        MinimumRemoveToMakeValidParentheses minimumRemoveToMakeValidParentheses = new MinimumRemoveToMakeValidParentheses();

        assertEquals("", minimumRemoveToMakeValidParentheses.minRemoveToMakeValid("))(("));
        assertEquals("lee(t(c)o)de", minimumRemoveToMakeValidParentheses.minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}