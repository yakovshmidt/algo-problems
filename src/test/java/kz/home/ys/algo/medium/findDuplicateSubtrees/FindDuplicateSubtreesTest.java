package kz.home.ys.algo.medium.findDuplicateSubtrees;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FindDuplicateSubtreesTest {

    @Test
    public void testFindDuplicateSubtrees() {
        List<TreeNode> duplicateSubtrees = new FindDuplicateSubtrees().findDuplicateSubtrees(
                new TreeNode(
                        1,
                        new TreeNode(2, new TreeNode(4), null),
                        new TreeNode(
                                3,
                                new TreeNode(2, new TreeNode(4), null),
                                new TreeNode(4)
                        )
                )
        );

        assertEquals(2, duplicateSubtrees.size());
        assertEquals(4, duplicateSubtrees.get(0).val);
        assertNull( duplicateSubtrees.get(0).left);
        assertNull( duplicateSubtrees.get(0).right);
        assertEquals(2, duplicateSubtrees.get(1).val);
        assertEquals(4, duplicateSubtrees.get(1).left.val);
        assertNull( duplicateSubtrees.get(1).left.left);
        assertNull( duplicateSubtrees.get(1).left.right);
        assertNull( duplicateSubtrees.get(1).right);
    }
}