package kz.home.ys.algo.easy.base7;

import junit.framework.TestCase;
import kz.home.ys.algo.easy.base7.Base7;

public class Base7Test extends TestCase {

    public void testConvertToBase7() {
        String result = new Base7().convertToBase7(100);

        assertEquals("202", result);
    }

    public void testConvertToBase7_2() {
        String result = new Base7().convertToBase7(-7);

        assertEquals("-10", result);
    }
}