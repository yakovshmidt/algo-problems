package kz.home.ys.algo.medium.flattenBinaryTreeToLinkedList;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertTrees;

public class FlattenBinaryTreeToLinkedListTest extends TestCase {

    public void testFlatten() {
        TreeNode expected = new TreeNode(
                1,
                null,
                new TreeNode(
                        2,
                        null,
                        new TreeNode(
                                3,
                                null,
                                new TreeNode(
                                        4,
                                        null,
                                        new TreeNode(
                                                5,
                                                null,
                                                new TreeNode(6)
                                        )
                                )
                        )
                )
        );

        TreeNode actual = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(4)
                ),
                new TreeNode(
                        5,
                        null,
                        new TreeNode(6)
                )
        );

        new FlattenBinaryTreeToLinkedList().flatten(actual);

        assertTrees(expected, actual);
    }
}