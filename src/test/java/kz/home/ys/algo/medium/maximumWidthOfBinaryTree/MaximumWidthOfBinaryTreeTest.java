package kz.home.ys.algo.medium.maximumWidthOfBinaryTree;

import junit.framework.TestCase;

public class MaximumWidthOfBinaryTreeTest extends TestCase {

    public void testWidthOfBinaryTree() {
        int maxWidthOfBinaryTree = new MaximumWidthOfBinaryTree().widthOfBinaryTree(
                new TreeNode(
                        1,
                        new TreeNode(
                                3,
                                new TreeNode(5),
                                new TreeNode(3)
                        ),
                        new TreeNode(
                                2,
                                null,
                                new TreeNode(9)
                        )
                )
        );

        assertEquals(4, maxWidthOfBinaryTree);
    }
}