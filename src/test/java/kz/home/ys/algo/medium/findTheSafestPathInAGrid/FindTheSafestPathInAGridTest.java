package kz.home.ys.algo.medium.findTheSafestPathInAGrid;

import junit.framework.TestCase;

import java.util.List;

public class FindTheSafestPathInAGridTest extends TestCase {

    public void testMaximumSafenessFactor() {
        int maximumSafenessFactor = new FindTheSafestPathInAGrid().maximumSafenessFactor(
                List.of(
                        List.of(0, 0, 1),
                        List.of(0, 0, 0),
                        List.of(0, 0, 0)
                )
        );

        assertEquals(2, maximumSafenessFactor);
    }
}