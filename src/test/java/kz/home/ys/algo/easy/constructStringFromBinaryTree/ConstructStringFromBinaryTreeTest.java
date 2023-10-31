package kz.home.ys.algo.easy.constructStringFromBinaryTree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class ConstructStringFromBinaryTreeTest extends TestCase {

    public void testTree2str() {
        String result = new ConstructStringFromBinaryTree().tree2str(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                null,
                                new TreeNode(4)
                        ),
                        new TreeNode(3)
                )
        );

        assertEquals("1(2()(4))(3)", result);
    }
}