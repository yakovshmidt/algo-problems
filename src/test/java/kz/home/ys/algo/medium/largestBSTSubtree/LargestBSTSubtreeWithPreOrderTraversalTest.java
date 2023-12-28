package kz.home.ys.algo.medium.largestBSTSubtree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class LargestBSTSubtreeWithPreOrderTraversalTest extends TestCase {

    public void testLargestBSTSubtree() {
        int result = new LargestBSTSubtreeWithPreOrderTraversal().largestBSTSubtree(
                new TreeNode(
                        10,
                        new TreeNode(
                                5,
                                new TreeNode(1),
                                new TreeNode(8)
                        ),
                        new TreeNode(
                                15,
                                null,
                                new TreeNode(7)
                        )
                )
        );

        assertEquals(3, result);
    }
}