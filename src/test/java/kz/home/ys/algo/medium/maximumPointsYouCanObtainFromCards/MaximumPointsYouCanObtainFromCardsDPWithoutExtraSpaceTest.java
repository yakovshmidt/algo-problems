package kz.home.ys.algo.medium.maximumPointsYouCanObtainFromCards;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumPointsYouCanObtainFromCardsDPWithoutExtraSpaceTest {

    @Test
    public void testMaxScore() {
        int maxScore = new MaximumPointsYouCanObtainFromCardsDPWithoutExtraSpace().maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3);

        assertEquals(12, maxScore);
    }
}