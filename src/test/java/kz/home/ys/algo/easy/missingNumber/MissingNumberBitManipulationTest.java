package kz.home.ys.algo.easy.missingNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberBitManipulationTest {

    @Test
    public void testMissingNumber() {
        int missingNumber = new MissingNumberBitManipulation().missingNumber(new int[]{3, 0, 1});

        assertEquals(2, missingNumber);
    }
}