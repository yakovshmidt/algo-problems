package kz.home.ys.algo.medium.lowestCommonAncestorOfDeepestLeaves;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class LowestCommonAncestorOfDeepestLeavesTest extends TestCase {

    public void testLcaDeepestLeaves() {
        TreeNode expected = new TreeNode(
                2,
                new TreeNode(7),
                new TreeNode(4)
        );
        TreeNode actual = new LowestCommonAncestorOfDeepestLeaves().lcaDeepestLeaves(
                new TreeNode(
                        3,
                        new TreeNode(
                                5,
                                new TreeNode(6),
                                expected
                        ),
                        new TreeNode(
                                1,
                                new TreeNode(0),
                                new TreeNode(8)
                        )
                )
        );

        assertEquals(expected, actual);
    }
}