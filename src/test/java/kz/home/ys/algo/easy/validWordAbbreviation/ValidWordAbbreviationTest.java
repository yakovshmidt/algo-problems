package kz.home.ys.algo.easy.validWordAbbreviation;

import junit.framework.TestCase;

public class ValidWordAbbreviationTest extends TestCase {

    public void testValidWordAbbreviation1() {
        boolean result = new ValidWordAbbreviation().validWordAbbreviation("internationalization", "i12iz4n");

        assertTrue(result);
    }

    public void testValidWordAbbreviation2() {
        boolean result = new ValidWordAbbreviation().validWordAbbreviation("hi", "1");

        assertTrue(result);
    }
}