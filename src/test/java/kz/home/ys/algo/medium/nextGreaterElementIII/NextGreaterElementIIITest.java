package kz.home.ys.algo.medium.nextGreaterElementIII;

import junit.framework.TestCase;

public class NextGreaterElementIIITest extends TestCase {

    public void testNextGreaterElement() {
        int result = new NextGreaterElementIII().nextGreaterElement(12);

        assertEquals(21, result);
    }
}