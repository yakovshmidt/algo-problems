package kz.home.ys.algo.medium.binaryTreeRightSideView;

import junit.framework.TestCase;

import java.util.List;

public class BinaryTreeRightSideViewBFSTest extends TestCase {

    public void testRightSideView() {
        List<Integer> result = new BinaryTreeRightSideViewBFS().rightSideView(new TreeNode(1, new TreeNode(2), null));

        assertEquals(2, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(2, result.get(1).intValue());
    }
}