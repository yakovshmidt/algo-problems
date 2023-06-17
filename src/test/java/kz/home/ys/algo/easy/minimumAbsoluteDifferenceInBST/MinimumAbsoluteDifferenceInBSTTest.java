package kz.home.ys.algo.easy.minimumAbsoluteDifferenceInBST;

import junit.framework.TestCase;

public class MinimumAbsoluteDifferenceInBSTTest extends TestCase {

    public void testGetMinimumDifference() {
        int minimumDifference = new MinimumAbsoluteDifferenceInBST().getMinimumDifference(
                new TreeNode(
                        1,
                        new TreeNode(0),
                        new TreeNode(
                                48,
                                new TreeNode(12),
                                new TreeNode(49)
                        )
                )
        );

        assertEquals(1, minimumDifference);
    }
}