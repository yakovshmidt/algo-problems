package kz.home.ys.algo.easy.canMakeArithmeticProgressionFromSequence;

import junit.framework.TestCase;

public class CanMakeArithmeticProgressionFromSequenceTest extends TestCase {

    public void testCanMakeArithmeticProgression() {
        boolean isArithmeticProgression = new CanMakeArithmeticProgressionFromSequence().canMakeArithmeticProgression(new int[]{3, 5, 1});

        assertTrue(isArithmeticProgression);
    }
}