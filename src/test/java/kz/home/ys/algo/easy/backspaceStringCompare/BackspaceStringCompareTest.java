package kz.home.ys.algo.easy.backspaceStringCompare;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

public class BackspaceStringCompareTest {

    @Test
    public void testBackspaceCompare() {
        boolean isBackspaceCompared = new BackspaceStringCompare().backspaceCompare("a#c", "b");

        assertFalse(isBackspaceCompared);
    }
}