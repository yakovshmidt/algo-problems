package kz.home.ys.algo.medium.minimumAddToMakeParenthesesValid;

import junit.framework.TestCase;

public class MinimumAddToMakeParenthesesValidTest extends TestCase {

    public void testMinAddToMakeValid() {
        int minAddToMakeValid = new MinimumAddToMakeParenthesesValid().minAddToMakeValid("())");

        assertEquals(1, minAddToMakeValid);
    }
}