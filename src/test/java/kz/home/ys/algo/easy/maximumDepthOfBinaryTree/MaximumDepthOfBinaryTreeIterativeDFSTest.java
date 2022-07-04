package kz.home.ys.algo.easy.maximumDepthOfBinaryTree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumDepthOfBinaryTreeIterativeDFSTest {

    @Test
    public void testMaxDepth() {
        int depth = new MaximumDepthOfBinaryTreeIterativeDFS().maxDepth(
                new TreeNode(
                        3,
                        new TreeNode(9),
                        new TreeNode(
                                20,
                                new TreeNode(15),
                                new TreeNode(7)
                        )
                )
        );

        assertEquals(3, depth);
    }
}