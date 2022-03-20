package kz.home.ys.algo.medium.validateBinarySearchTree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateBinarySearchTreeTest {

    @Test
    public void testIsValidBST() {
        boolean isValidBST = new ValidateBinarySearchTree().isValidBST(
                new TreeNode(
                        5,
                        new TreeNode(1),
                        new TreeNode(
                                4,
                                new TreeNode(3),
                                new TreeNode(6)
                        )
                )
        );

        assertFalse(isValidBST);
    }
}