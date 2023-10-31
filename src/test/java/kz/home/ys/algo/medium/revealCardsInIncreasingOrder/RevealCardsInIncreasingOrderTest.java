package kz.home.ys.algo.medium.revealCardsInIncreasingOrder;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class RevealCardsInIncreasingOrderTest extends TestCase {

    public void testDeckRevealedIncreasing() {
        int[] expected = new int[]{2, 13, 3, 11, 5, 17, 7};

        int[] actual = new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7});

        assertArrays(expected, actual);
    }
}