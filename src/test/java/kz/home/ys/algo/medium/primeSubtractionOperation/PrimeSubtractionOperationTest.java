package kz.home.ys.algo.medium.primeSubtractionOperation;

import junit.framework.TestCase;

public class PrimeSubtractionOperationTest extends TestCase {

    public void testPrimeSubOperation() {
        boolean result = new PrimeSubtractionOperation().primeSubOperation(new int[]{4, 9, 6, 10});

        assertTrue(result);
    }
}