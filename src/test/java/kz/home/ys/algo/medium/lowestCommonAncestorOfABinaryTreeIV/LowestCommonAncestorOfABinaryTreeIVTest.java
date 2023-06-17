package kz.home.ys.algo.medium.lowestCommonAncestorOfABinaryTreeIV;

import junit.framework.TestCase;

public class LowestCommonAncestorOfABinaryTreeIVTest extends TestCase {

    public void testLowestCommonAncestor() {
        TreeNode first = new TreeNode(7);
        TreeNode second = new TreeNode(4);
        TreeNode lowestCommonAncestor = new LowestCommonAncestorOfABinaryTreeIV().lowestCommonAncestor(
                new TreeNode(
                        3,
                        new TreeNode(
                                5,
                                new TreeNode(6),
                                new TreeNode(
                                        2,
                                        first,
                                        second
                                )
                        ),
                        new TreeNode(
                                1,
                                new TreeNode(0),
                                new TreeNode(8)
                        )),
                new TreeNode[]{first, second}
        );

        assertEquals(2, lowestCommonAncestor.val);
    }
}