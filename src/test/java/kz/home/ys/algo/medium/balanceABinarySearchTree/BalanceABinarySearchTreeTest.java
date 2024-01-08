package kz.home.ys.algo.medium.balanceABinarySearchTree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertBSTs;

public class BalanceABinarySearchTreeTest extends TestCase {

    public void testBalanceBST() {
        TreeNode expected = new TreeNode(
                2,
                new TreeNode(1),
                new TreeNode(
                        3,
                        null,
                        new TreeNode(4)
                )
        );

        TreeNode actual = new BalanceABinarySearchTree().balanceBST(
                new TreeNode(
                        1,
                        null,
                        new TreeNode(
                                2,
                                null,
                                new TreeNode(
                                        3,
                                        null,
                                        new TreeNode(4)
                                )
                        )
                )
        );

        assertBSTs(expected, actual);
    }
}