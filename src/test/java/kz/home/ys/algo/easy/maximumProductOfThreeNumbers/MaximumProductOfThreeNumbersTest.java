package kz.home.ys.algo.easy.maximumProductOfThreeNumbers;

import junit.framework.TestCase;

public class MaximumProductOfThreeNumbersTest extends TestCase {

    public void testMaximumProduct() {
        int maximumProduct = new MaximumProductOfThreeNumbers().maximumProduct(new int[]{-1, -2, -3});

        assertEquals(-6, maximumProduct);
    }
}