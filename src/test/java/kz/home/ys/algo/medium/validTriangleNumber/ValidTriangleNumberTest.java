package kz.home.ys.algo.medium.validTriangleNumber;

import junit.framework.TestCase;

public class ValidTriangleNumberTest extends TestCase {

    public void testTriangleNumber() {
        int triangleNumber = new ValidTriangleNumber().triangleNumber(new int[]{2, 2, 3, 4});

        assertEquals(3, triangleNumber);
    }
}