package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.countCompleteTreeNodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCompleteTreeNodesTest {

    @Test
    public void testCountNodes() {
        int count = new CountCompleteTreeNodes().countNodes(
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

        assertEquals(6, count);
    }
}