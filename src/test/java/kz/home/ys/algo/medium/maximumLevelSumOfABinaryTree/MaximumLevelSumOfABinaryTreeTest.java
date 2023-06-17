package kz.home.ys.algo.medium.maximumLevelSumOfABinaryTree;

import junit.framework.TestCase;

public class MaximumLevelSumOfABinaryTreeTest extends TestCase {

    public void testMaxLevelSum() {
        int maxLevelSum = new MaximumLevelSumOfABinaryTree().maxLevelSum(
                new TreeNode(
                        1,
                        new TreeNode(
                                7,
                                new TreeNode(7),
                                new TreeNode(-8)
                        ),
                        new TreeNode(0)
                )
        );

        assertEquals(2, maxLevelSum);
    }
}