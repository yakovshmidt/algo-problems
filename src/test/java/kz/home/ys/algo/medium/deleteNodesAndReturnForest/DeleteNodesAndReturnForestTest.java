package kz.home.ys.algo.medium.deleteNodesAndReturnForest;

import junit.framework.TestCase;

import java.util.List;

public class DeleteNodesAndReturnForestTest extends TestCase {

    public void testDelNodes() {
        List<TreeNode> treeNodes = new DeleteNodesAndReturnForest().delNodes(
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
                                new TreeNode(7)
                        )
                ),
                new int[]{3, 5}
        );

        assertEquals(3, treeNodes.size());
        assertEquals(1, treeNodes.get(0).val);
        assertEquals(6, treeNodes.get(1).val);
        assertEquals(7, treeNodes.get(2).val);
    }
}