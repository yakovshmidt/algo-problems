package kz.home.ys.algo.easy.canMakeArithmeticProgressionFromSequence;

import junit.framework.TestCase;

public class CanMakeArithmeticProgressionFromSequenceUsingSetTest extends TestCase {

    public void testCanMakeArithmeticProgression() {
        boolean isArithmeticProgression = new CanMakeArithmeticProgressionFromSequenceUsingSet().canMakeArithmeticProgression(new int[]{3, 5, 1});

        assertTrue(isArithmeticProgression);
    }
}