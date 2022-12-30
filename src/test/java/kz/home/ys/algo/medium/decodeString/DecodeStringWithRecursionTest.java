package kz.home.ys.algo.medium.decodeString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeStringWithRecursionTest {

    @Test
    public void testDecodeString() {
        String actual = new DecodeStringWithRecursion().decodeString("3[a]2[bc]");

        assertEquals("aaabcbc", actual);
    }
}