package kz.home.ys.algo.easy.thirdMaximumNumber;

import junit.framework.TestCase;

public class ThirdMaximumNumberTest extends TestCase {

    public void testThirdMax() {
        int thirdUniqueMax = new ThirdMaximumNumber().thirdMax(new int[]{2, 2, 3, 1});

        assertEquals(1, thirdUniqueMax);
    }
}