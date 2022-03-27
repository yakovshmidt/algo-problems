package kz.home.ys.algo.easy.firstBadVersion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionBSTTest {

    @Test
    public void testFirstBadVersion() {
        int expected = 4;

        int actual = new FirstBadVersionBST().firstBadVersion(5);

        assertEquals(expected, actual);
    }
}