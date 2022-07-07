package kz.home.ys.algo.easy.invertBinaryTree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvertBinaryTreeTest {

    @Test
    public void testInvertTree() {
        TreeNode invertedTree = new InvertBinaryTree().invertTree(
                new TreeNode(
                        4,
                        new TreeNode(
                                2,
                                new TreeNode(1),
                                new TreeNode(3)
                        ),
                        new TreeNode(
                                7,
                                new TreeNode(6),
                                new TreeNode(9)
                        )
                )
        );

        assertEquals(4,invertedTree.val);
        assertEquals(7,invertedTree.left.val);
        assertEquals(2,invertedTree.right.val);
        assertEquals(9,invertedTree.left.left.val);
        assertEquals(6,invertedTree.left.right.val);
        assertEquals(3,invertedTree.right.left.val);
        assertEquals(1,invertedTree.right.right.val);
    }
}