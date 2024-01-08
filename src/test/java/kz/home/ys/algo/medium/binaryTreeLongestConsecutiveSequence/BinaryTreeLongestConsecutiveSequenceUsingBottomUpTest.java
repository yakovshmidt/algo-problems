package kz.home.ys.algo.medium.binaryTreeLongestConsecutiveSequence;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class BinaryTreeLongestConsecutiveSequenceUsingBottomUpTest extends TestCase {

    public void testLongestConsecutive() {
        int result = new BinaryTreeLongestConsecutiveSequenceUsingBottomUp().longestConsecutive(
                new TreeNode(
                        1,
                        null,
                        new TreeNode(
                                3,
                                null,
                                new TreeNode(
                                        4,
                                        null,
                                        new TreeNode(5)
                                )
                        )
                )
        );

        assertEquals(3, result);
    }
}