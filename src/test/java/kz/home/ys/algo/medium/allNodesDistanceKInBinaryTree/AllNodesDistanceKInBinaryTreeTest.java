package kz.home.ys.algo.medium.allNodesDistanceKInBinaryTree;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

import java.util.List;

public class AllNodesDistanceKInBinaryTreeTest extends TestCase {

    public void testDistanceK() {
        TreeNode node = new TreeNode(1);
        List<Integer> result = new AllNodesDistanceKInBinaryTree().distanceK(node, node, 3);

        assertEquals(0, result.size());
    }
}