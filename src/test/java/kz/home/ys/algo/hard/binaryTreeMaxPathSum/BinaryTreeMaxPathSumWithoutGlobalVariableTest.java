package kz.home.ys.algo.hard.binaryTreeMaxPathSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeMaxPathSumWithoutGlobalVariableTest {

    @Test
    public void testMaxPathSum() {
        int maxPathSum = new BinaryTreeMaxPathSumWithoutGlobalVariable().maxPathSum(
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