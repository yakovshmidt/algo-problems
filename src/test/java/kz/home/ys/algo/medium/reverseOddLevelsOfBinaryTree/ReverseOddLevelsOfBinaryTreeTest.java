package kz.home.ys.algo.medium.reverseOddLevelsOfBinaryTree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertTrees;

public class ReverseOddLevelsOfBinaryTreeTest extends TestCase {

    public void testReverseOddLevels() {
        TreeNode expected = new TreeNode(
                2,
                new TreeNode(5),
                new TreeNode(3)
        );

        TreeNode actual = new ReverseOddLevelsOfBinaryTree().reverseOddLevels(
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(5)
                )
        );

        assertTrees(expected, actual);
    }
}