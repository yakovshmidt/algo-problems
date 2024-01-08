package kz.home.ys.algo.medium.lowestCommonAncestorOfABinaryTree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class LowestCommonAncestorOfABinaryTreeTest extends TestCase {

    public void testLowestCommonAncestor() {
        TreeNode q = new TreeNode(4);
        TreeNode p = new TreeNode(
                5,
                new TreeNode(6),
                new TreeNode(
                        2,
                        new TreeNode(7),
                        q
                )
        );
        TreeNode actual = new LowestCommonAncestorOfABinaryTree().lowestCommonAncestor(
                new TreeNode(
                        3,
                        p,
                        new TreeNode(
                                1,
                                new TreeNode(0),
                                new TreeNode(8)
                        )
                ),
                p,
                q
        );

        assertEquals(p, actual);
    }
}