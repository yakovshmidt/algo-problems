package kz.home.ys.algo.medium.constructBinaryTreeFromString;

import junit.framework.TestCase;
import kz.home.ys.algo.helper.TreeNode;

public class ConstructBinaryTreeFromStringTest extends TestCase {

    public void testStr2tree() {
        TreeNode node = new ConstructBinaryTreeFromString().str2tree("4(2(3)(1))(6(5))");

        assertNotNull(node);
    }
}