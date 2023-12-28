package kz.home.ys.algo.medium.checkCompletenessOfABinaryTree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class CheckCompletenessOfABinaryTreeUsingBFSTest extends TestCase {

    public void testIsCompleteTree() {
        boolean result = new CheckCompletenessOfABinaryTreeUsingBFS().isCompleteTree(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(4),
                                new TreeNode(5)
                        ),
                        new TreeNode(
                                3,
                                new TreeNode(6),
                                null
                        )
                )
        );

        assertTrue(result);
    }
}