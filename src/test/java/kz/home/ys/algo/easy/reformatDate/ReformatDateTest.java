package kz.home.ys.algo.easy.reformatDate;

import junit.framework.TestCase;

public class ReformatDateTest extends TestCase {

    public void testReformatDate() {
        String reformattedDate = new ReformatDate().reformatDate("20th Oct 2052");

        assertEquals("2052-10-20", reformattedDate);
    }
}