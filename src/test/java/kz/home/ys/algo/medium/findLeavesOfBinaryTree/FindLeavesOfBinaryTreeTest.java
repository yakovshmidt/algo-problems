package kz.home.ys.algo.medium.findLeavesOfBinaryTree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindLeavesOfBinaryTreeTest {

    @Test
    public void testFindLeaves() {
        List<List<Integer>> leaves = new FindLeavesOfBinaryTree().findLeaves(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(4),
                                new TreeNode(5)
                        ),
                        new TreeNode(3)
                )
        );

        assertEquals(3, leaves.size());
        assertEquals(3, leaves.get(0).size());
        assertEquals(4, leaves.get(0).get(0).intValue());
        assertEquals(5, leaves.get(0).get(1).intValue());
        assertEquals(3, leaves.get(0).get(2).intValue());
        assertEquals(1, leaves.get(1).size());
        assertEquals(2, leaves.get(1).get(0).intValue());
        assertEquals(1, leaves.get(2).size());
        assertEquals(1, leaves.get(2).get(0).intValue());
    }
}