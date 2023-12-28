package kz.home.ys.algo.medium.nextGreaterElementIII;

import junit.framework.TestCase;

public class NextGreaterElementIIIUsingPermutationsTest extends TestCase {

    public void testNextGreaterElement() {
        int result = new NextGreaterElementIIIUsingPermutations().nextGreaterElement(12);

        assertEquals(21, result);
    }
}