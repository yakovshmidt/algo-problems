package kz.home.ys.algo.medium.constructKPalindromeStrings;

import junit.framework.TestCase;

public class ConstructKPalindromeStringsTest extends TestCase {

    public void testCanConstruct() {
        boolean result = new ConstructKPalindromeStrings().canConstruct("annabelle", 2);

        assertTrue(result);
    }
}