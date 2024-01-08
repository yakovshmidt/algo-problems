package kz.home.ys.algo.hard.heightOfBinaryTreeAfterSubtreeRemovalQueries;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class HeightOfBinaryTreeAfterSubtreeRemovalQueriesTest extends TestCase {

    public void testTreeQueries() {
        int[] expected = new int[]{2};

        int[] actual = new HeightOfBinaryTreeAfterSubtreeRemovalQueries().treeQueries(
                new TreeNode(
                        1,
                        new TreeNode(
                                3,
                                new TreeNode(2),
                                null
                        ),
                        new TreeNode(
                                4,
                                new TreeNode(6),
                                new TreeNode(
                                        5,
                                        null,
                                        new TreeNode(7)
                                )
                        )
                ),
                new int[]{4}
        );

        assertArrays(expected, actual);
    }
}