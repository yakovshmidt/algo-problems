package kz.home.ys.algo.medium.productOfArrayExceptSelf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductOfArrayExceptSelfNeetCodeTest {

    @Test
    public void testProductExceptSelf() {
        int[] productExceptSelf1 = new ProductOfArrayExceptSelfNeetCode().productExceptSelf(new int[]{1, 2, 3, 4});

        assertEquals(24, productExceptSelf1[0]);
        assertEquals(12, productExceptSelf1[1]);
        assertEquals(8, productExceptSelf1[2]);
        assertEquals(6, productExceptSelf1[3]);

        int[] productExceptSelf2 = new ProductOfArrayExceptSelfNeetCode().productExceptSelf(new int[]{-1, 1, 0, -3, 3});

        assertEquals(0, productExceptSelf2[0]);
        assertEquals(0, productExceptSelf2[1]);
        assertEquals(9, productExceptSelf2[2]);
        assertEquals(0, productExceptSelf2[3]);
        assertEquals(0, productExceptSelf2[4]);

        int[] productExceptSelf3 = new ProductOfArrayExceptSelfNeetCode().productExceptSelf(new int[]{1, 0, 1, 0});

        assertEquals(0, productExceptSelf3[0]);
        assertEquals(0, productExceptSelf3[1]);
        assertEquals(0, productExceptSelf3[2]);
        assertEquals(0, productExceptSelf3[3]);
    }
}