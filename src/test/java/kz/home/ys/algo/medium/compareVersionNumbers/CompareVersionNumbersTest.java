package kz.home.ys.algo.medium.compareVersionNumbers;

import junit.framework.TestCase;

public class CompareVersionNumbersTest extends TestCase {

    public void testCompareVersion() {
        int result = new CompareVersionNumbers().compareVersion("1.0", "1.0.0.0");

        assertEquals(0, result);
    }
}