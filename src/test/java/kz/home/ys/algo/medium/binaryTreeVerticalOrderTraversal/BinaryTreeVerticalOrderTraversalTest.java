package kz.home.ys.algo.medium.binaryTreeVerticalOrderTraversal;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class BinaryTreeVerticalOrderTraversalTest extends TestCase {

    public void testVerticalOrder() {
        List<List<Integer>> expected = List.of(
                List.of(9),
                List.of(3,15),
                List.of(20),
                List.of(7)
        );

        List<List<Integer>> actual = new BinaryTreeVerticalOrderTraversal().verticalOrder(
                new TreeNode(
                        3,
                        new TreeNode(9),
                        new TreeNode(
                                20,
                                new TreeNode(15),
                                new TreeNode(7)
                        )
                )
        );

        assertMatrices(expected, actual);
    }
}