package kz.home.ys.algo.medium.stepByStepDirectionsFromABinaryTreeNodeToAnother;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StepByStepDirectionsFromABinaryTreeNodeToAnotherTest   {

    @Test
    public void testGetDirections() {
        String directions = new StepByStepDirectionsFromABinaryTreeNodeToAnother().getDirections(
                new TreeNode(
                        5,
                        new TreeNode(
                                1,
                                new TreeNode(3),
                                null
                        ),
                        new TreeNode(
                                2,
                                new TreeNode(6),
                                new TreeNode(4)
                        )
                ),
                3,
                6
        );

        assertEquals("UURL", directions);
    }
}