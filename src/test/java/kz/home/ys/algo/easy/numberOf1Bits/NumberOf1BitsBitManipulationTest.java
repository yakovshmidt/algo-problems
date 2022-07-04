package kz.home.ys.algo.easy.numberOf1Bits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOf1BitsBitManipulationTest {

    @Test
    public void testHammingWeight() {
        int hammingWeight = new NumberOf1Bits().hammingWeight(00000000000000000000000000001011);

        assertEquals(3, hammingWeight);
    }
}