package kz.home.ys.algo.medium.constructQuadTree;

import junit.framework.TestCase;

public class ConstructQuadTreeTest extends TestCase {

    public void testConstruct() {
        Node node = new ConstructQuadTree().construct(new int[][]{{0, 1}, {1, 0}});

        assertNotNull(node);
    }
}