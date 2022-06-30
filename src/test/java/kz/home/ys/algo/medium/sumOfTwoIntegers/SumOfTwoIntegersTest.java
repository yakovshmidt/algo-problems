package kz.home.ys.algo.medium.sumOfTwoIntegers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfTwoIntegersTest {

    @Test
    public void testGetSum() {
        int sum = new SumOfTwoIntegers().getSum(2, 3);

        assertEquals(5, sum);
    }
}