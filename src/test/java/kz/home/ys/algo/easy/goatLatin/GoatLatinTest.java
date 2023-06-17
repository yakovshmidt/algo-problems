package kz.home.ys.algo.easy.goatLatin;

import junit.framework.TestCase;

public class GoatLatinTest extends TestCase {

    public void testToGoatLatin() {
        String expected = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";

        String actual = new GoatLatin().toGoatLatin("I speak Goat Latin");

        assertEquals(expected, actual);
    }
}