package kz.home.ys.algo.easy.averageSalaryExcludingMinAndMaxSalary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageSalaryExcludingMinAndMaxSalaryTest {

    @Test
    public void testAverage() {
        double expected = 2500.0;

        double actual = new AverageSalaryExcludingMinAndMaxSalary().average(new int[]{4000, 3000, 1000, 2000});

        assertEquals(expected, actual, 0);
    }
}