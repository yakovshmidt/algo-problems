package kz.home.ys.algo.easy.determineWhetherMatrixCanBeObtainedByRotation;

import junit.framework.TestCase;

public class DetermineWhetherMatrixCanBeObtainedByRotationTest extends TestCase {

    public void testFindRotation() {
        boolean canBeRotated = new DetermineWhetherMatrixCanBeObtainedByRotation().findRotation(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}, new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 0}});

        assertTrue(canBeRotated);
    }
}