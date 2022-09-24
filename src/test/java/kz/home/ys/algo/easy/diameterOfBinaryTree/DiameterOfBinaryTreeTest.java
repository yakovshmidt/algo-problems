package kz.home.ys.algo.easy.diameterOfBinaryTree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiameterOfBinaryTreeTest {

    @Test
    public void testDiameterOfBinaryTree() {
        int diameterOfBinaryTree = new DiameterOfBinaryTree().diameterOfBinaryTree(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(4),
                                new TreeNode(5)
                        ),
                        new TreeNode(3)
                )
        );

        assertEquals(3, diameterOfBinaryTree);
    }
}