package kz.home.ys.algo.medium.detonateTheMaximumBombs;

import junit.framework.TestCase;

public class DetonateTheMaximumBombsTest extends TestCase {

    public void testMaximumDetonation() {
        int maxDetonatedBombs = new DetonateTheMaximumBombs().maximumDetonation(new int[][]{{2,1,3},{6,1,4}});

        assertEquals(2, maxDetonatedBombs);
    }
}