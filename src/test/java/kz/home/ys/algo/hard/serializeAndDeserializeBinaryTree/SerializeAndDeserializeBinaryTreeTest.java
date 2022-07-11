package kz.home.ys.algo.hard.serializeAndDeserializeBinaryTree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SerializeAndDeserializeBinaryTreeTest {

    @Test
    public void testSerializeAndDeserialize() {
        SerializeAndDeserializeBinaryTree ser = new SerializeAndDeserializeBinaryTree();
        SerializeAndDeserializeBinaryTree deser = new SerializeAndDeserializeBinaryTree();

        TreeNode ans = deser.deserialize(
                ser.serialize(
                        new TreeNode(
                                1,
                                new TreeNode(2),
                                new TreeNode(
                                        3,
                                        new TreeNode(4),
                                        new TreeNode(5)
                                )
                        )
                )
        );

        assertEquals(1, ans.val);
        assertEquals(2, ans.left.val);
        assertNull(ans.left.left);
        assertNull(ans.left.right);
        assertEquals(3, ans.right.val);
        assertEquals(4, ans.right.left.val);
        assertNull(ans.right.left.left);
        assertNull(ans.right.left.right);
        assertEquals(5, ans.right.right.val);
        assertNull(ans.right.right.left);
        assertNull(ans.right.right.right);
    }
}