package kz.home.ys.algo.medium.binaryTreeZigzagOrderTraversal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeZigzagOrderTraversalTest   {

    @Test
    public void testZigzagLevelOrder() {
        List<List<Integer>> result = new BinaryTreeZigzagOrderTraversal().zigzagLevelOrder(
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

        assertEquals(3, result.size());
    }
}