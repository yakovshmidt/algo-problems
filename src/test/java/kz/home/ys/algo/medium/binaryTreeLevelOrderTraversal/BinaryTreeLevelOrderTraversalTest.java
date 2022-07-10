package kz.home.ys.algo.medium.binaryTreeLevelOrderTraversal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void testLevelOrder() {
        List<List<Integer>> levelOrder = new BinaryTreeLevelOrderTraversal().levelOrder(
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

        assertEquals(3, levelOrder.size());
        assertEquals(1, levelOrder.get(0).size());
        assertEquals(3, levelOrder.get(0).get(0).intValue());
        assertEquals(2, levelOrder.get(1).size());
        assertEquals(9, levelOrder.get(1).get(0).intValue());
        assertEquals(20, levelOrder.get(1).get(1).intValue());
        assertEquals(2, levelOrder.get(2).size());
        assertEquals(15, levelOrder.get(2).get(0).intValue());
        assertEquals(7, levelOrder.get(2).get(1).intValue());
    }
}