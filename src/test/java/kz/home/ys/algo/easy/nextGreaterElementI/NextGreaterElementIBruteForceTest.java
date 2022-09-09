package kz.home.ys.algo.easy.nextGreaterElementI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextGreaterElementIBruteForceTest {

    @Test
    public void testNextGreaterElement() {
        int[] expected = new int[] {7,7,7,7,7};

        int[] actual = new NextGreaterElementIBruteForce()
                .nextGreaterElement(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7});

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}