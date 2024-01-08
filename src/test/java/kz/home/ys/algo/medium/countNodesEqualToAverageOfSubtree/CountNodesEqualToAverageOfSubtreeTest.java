package kz.home.ys.algo.medium.countNodesEqualToAverageOfSubtree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class CountNodesEqualToAverageOfSubtreeTest extends TestCase {

    public void testAverageOfSubtree() {
        int result = new CountNodesEqualToAverageOfSubtree().averageOfSubtree(
                new TreeNode(
                        4,
                        new TreeNode(
                                8,
                                new TreeNode(0),
                                new TreeNode(1)
                        ),
                        new TreeNode(
                                5,
                                null,
                                new TreeNode(6)
                        )
                )
        );

        assertEquals(5, result);
    }
}