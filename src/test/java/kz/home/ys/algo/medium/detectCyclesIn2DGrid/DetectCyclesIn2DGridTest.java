package kz.home.ys.algo.medium.detectCyclesIn2DGrid;

import junit.framework.TestCase;

public class DetectCyclesIn2DGridTest extends TestCase {

    public void testContainsCycle1() {
        boolean result = new DetectCyclesIn2DGrid().containsCycle(
                new char[][]{
                        {'a', 'a', 'a', 'a'},
                        {'a', 'b', 'b', 'a'},
                        {'a', 'b', 'b', 'a'},
                        {'a', 'a', 'a', 'a'}
                }
        );

        assertTrue(result);
    }

    public void testContainsCycle2() {
        boolean result = new DetectCyclesIn2DGrid().containsCycle(
                new char[][]{
                        {'c','a','d'},
                        {'a','a','a'},
                        {'a','a','d'},
                        {'a','c','d'},
                        {'a','b','c'}
                }
        );

        assertTrue(result);
    }
}