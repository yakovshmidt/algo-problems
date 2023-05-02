package kz.home.ys.algo.medium.longestZigZagPathInABinaryTree;

import junit.framework.TestCase;

public class LongestZigZagPathInABinaryTreeTest extends TestCase {

    public void testLongestZigZag() {
        int longestZigZagPath = new LongestZigZagPathInABinaryTree().longestZigZag(
                new TreeNode(
                        1,
                        new TreeNode(
                                1,
                                null,
                                new TreeNode(
                                        1,
                                        new TreeNode(
                                                1,
                                                null,
                                                new TreeNode(1)
                                        ),
                                        new TreeNode(1)
                                )
                        ),
                        new TreeNode(1)
                )
        );

        assertEquals(4, longestZigZagPath);
    }
}