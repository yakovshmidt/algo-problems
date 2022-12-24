package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.binaryTreeMaximumPathSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeMaximumPathSumTest {

    @Test
    public void testMaxPathSum() {
        int maxPathSum = new BinaryTreeMaximumPathSum().maxPathSum(
                new TreeNode(
                        -10,
                        new TreeNode(9),
                        new TreeNode(
                                20,
                                new TreeNode(15),
                                new TreeNode(7)
                        )
                )
        );

        assertEquals(42, maxPathSum);
    }
}