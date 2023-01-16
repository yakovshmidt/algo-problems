package kz.home.ys.algo.medium.flipBinaryTreeToMatchPreorderTraversal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlipBinaryTreeToMatchPreorderTraversalTest   {

    @Test
    public void testFlipMatchVoyage() {
        List<Integer> result = new FlipBinaryTreeToMatchPreorderTraversal().flipMatchVoyage(
                new TreeNode(1, null, new TreeNode(2)),
                new int[]{1, 2}
        );

        assertEquals(0, result.size());
    }
}