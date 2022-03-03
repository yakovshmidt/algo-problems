package kz.home.ys.algo.easy.nonConstructibleChange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonConstructibleChangeTest {

    @Test
    public void testNonConstructibleChange() {
        int nonConstructibleChange = new NonConstructibleChange().nonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22});

        assertEquals(20, nonConstructibleChange);
    }
}