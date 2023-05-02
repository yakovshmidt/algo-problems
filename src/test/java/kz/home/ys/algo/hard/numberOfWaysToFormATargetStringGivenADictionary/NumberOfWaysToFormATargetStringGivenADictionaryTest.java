package kz.home.ys.algo.hard.numberOfWaysToFormATargetStringGivenADictionary;

import junit.framework.TestCase;

public class NumberOfWaysToFormATargetStringGivenADictionaryTest extends TestCase {

    public void testNumWays() {
        int numberOfWays = new NumberOfWaysToFormATargetStringGivenADictionary().numWays(new String[]{"abba","baab"}, "bab");

        assertEquals(4, numberOfWays);
    }
}