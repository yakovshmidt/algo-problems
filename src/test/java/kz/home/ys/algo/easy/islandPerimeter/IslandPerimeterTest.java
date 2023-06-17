package kz.home.ys.algo.easy.islandPerimeter;

import junit.framework.TestCase;

public class IslandPerimeterTest extends TestCase {

    public void testIslandPerimeter() {
        int islandPerimeter = new IslandPerimeter().islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}});

        assertEquals(16, islandPerimeter);
    }
}