package kz.home.ys.algo.easy.lowestCommonAncestorOfBinarySearchTree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowestCommonAncestorOfBinarySearchTreeTest {

    @Test
    public void testLowestCommonAncestor() {
        TreeNode q = new TreeNode(
                4,
                new TreeNode(3),
                new TreeNode(5)
        );
        TreeNode p = new TreeNode(
                2,
                new TreeNode(0),
                q
        );
        TreeNode root = new TreeNode(
                6,
                p,
                new TreeNode(
                        8,
                        new TreeNode(7),
                        new TreeNode(9)
                )
        );
        TreeNode commonAncestor = new LowestCommonAncestorOfBinarySearchTree().lowestCommonAncestor(root, p, q);

        assertEquals(p.val, commonAncestor.val);
    }
}