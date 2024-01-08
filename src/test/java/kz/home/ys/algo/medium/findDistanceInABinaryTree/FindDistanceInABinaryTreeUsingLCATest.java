package kz.home.ys.algo.medium.findDistanceInABinaryTree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class FindDistanceInABinaryTreeUsingLCATest extends TestCase {

    public void testFindDistance() {
        int result = new FindDistanceInABinaryTreeUsingLCA().findDistance(
                new TreeNode(
                        3,
                        new TreeNode(
                                5,
                                new TreeNode(6),
                                new TreeNode(
                                        2,
                                        new TreeNode(7),
                                        new TreeNode(4)
                                )
                        ),
                        new TreeNode(
                                1,
                                new TreeNode(0),
                                new TreeNode(8)
                        )
                ),
                5,
                0
        );

        assertEquals(3, result);
    }
}