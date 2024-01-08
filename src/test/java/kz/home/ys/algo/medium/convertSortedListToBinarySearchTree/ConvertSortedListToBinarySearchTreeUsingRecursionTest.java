package kz.home.ys.algo.medium.convertSortedListToBinarySearchTree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.ListNode;
import kz.home.ys.algo.helper.TreeNode;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertTrees;

public class ConvertSortedListToBinarySearchTreeUsingRecursionTest extends TestCase {

    public void testSortedListToBST() {
        TreeNode expected = new TreeNode(
                0,
                new TreeNode(
                        -3,
                        new TreeNode(-10),
                        null
                ),
                new TreeNode(
                        9,
                        new TreeNode(5),
                         null
                )
        );

        TreeNode actual = new ConvertSortedListToBinarySearchTreeUsingRecursion().sortedListToBST(
                new ListNode(-10, new ListNode(-3, new ListNode(0, new ListNode(5, new ListNode(9)))))
        );

        assertTrees(expected, actual);
    }
}