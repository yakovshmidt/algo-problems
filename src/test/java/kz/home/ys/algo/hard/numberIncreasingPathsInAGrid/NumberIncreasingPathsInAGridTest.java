package kz.home.ys.algo.hard.numberIncreasingPathsInAGrid;

import junit.framework.TestCase;

public class NumberIncreasingPathsInAGridTest extends TestCase {

    public void testCountPaths() {
        int numberOfPaths = new NumberIncreasingPathsInAGrid().countPaths(new int[][]{{1, 1}, {3, 4}});

        assertEquals(8, numberOfPaths);
    }
}