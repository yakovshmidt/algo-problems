package kz.home.ys.algo.medium.wiggleSortII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WiggleSortIITest {

    @Test
    public void testWiggleSort() {
        int[] actual = {3, 5, 2, 1, 6, 4};
        int[] expected = {3, 5, 1, 6, 2, 4};

        new WiggleSortII().wiggleSort(actual);

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}