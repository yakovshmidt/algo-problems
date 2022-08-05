package kz.home.ys.algo.medium.constructBinaryTreeFromPreorderAndInorderTraversal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    public void testBuildTree() {
        TreeNode treeNode = new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});

        assertEquals(3, treeNode.val);
        assertEquals(9, treeNode.left.val);
        assertEquals(20, treeNode.right.val);
        assertEquals(15, treeNode.right.left.val);
        assertEquals(7, treeNode.right.right.val);
    }
}