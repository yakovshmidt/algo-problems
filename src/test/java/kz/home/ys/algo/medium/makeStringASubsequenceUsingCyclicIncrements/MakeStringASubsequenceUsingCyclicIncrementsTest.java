package kz.home.ys.algo.medium.makeStringASubsequenceUsingCyclicIncrements;

import junit.framework.TestCase;

public class MakeStringASubsequenceUsingCyclicIncrementsTest extends TestCase {

    public void testCanMakeSubsequence() {
        boolean result = new MakeStringASubsequenceUsingCyclicIncrements().canMakeSubsequence("abc", "ad");

        assertTrue(result);
    }
}