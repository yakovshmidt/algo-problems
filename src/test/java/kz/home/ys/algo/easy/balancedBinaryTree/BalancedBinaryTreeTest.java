package kz.home.ys.algo.easy.balancedBinaryTree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class BalancedBinaryTreeTest extends TestCase {

    public void testIsBalanced() {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

        boolean isBalanced = balancedBinaryTree.isBalanced(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(
                                        3,
                                        new TreeNode(4),
                                        new TreeNode(4)
                                ),
                                new TreeNode(3)
                        ),
                        new TreeNode(2)
                )
        );

        assertFalse(isBalanced);
    }

    public void testIsBalanced2() {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

        boolean isBalanced = balancedBinaryTree.isBalanced(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(
                                        4,
                                        new TreeNode(8),
                                        null
                                ),
                                new TreeNode(5)
                        ),
                        new TreeNode(
                                3,
                                new TreeNode(6),
                                null
                        )
                )
        );

        assertTrue(isBalanced);
    }
}