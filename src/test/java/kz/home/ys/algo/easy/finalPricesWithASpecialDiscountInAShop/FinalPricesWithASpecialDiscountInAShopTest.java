package kz.home.ys.algo.easy.finalPricesWithASpecialDiscountInAShop;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class FinalPricesWithASpecialDiscountInAShopTest extends TestCase {

    public void testFinalPrices() {
        int[] expected = new int[]{4, 2, 4, 2, 3};

        int[] actual = new FinalPricesWithASpecialDiscountInAShop().finalPrices(new int[]{8, 4, 6, 2, 3});

        assertArrays(expected, actual);
    }
}