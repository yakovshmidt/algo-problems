package kz.home.ys.algo.easy.signOfTheProductOfAnArray;

import junit.framework.TestCase;

public class SignOfTheProductOfAnArrayTest extends TestCase {

    public void testArraySign() {
        int arraySign = new SignOfTheProductOfAnArray().arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1});

        assertEquals(1, arraySign);
    }
}