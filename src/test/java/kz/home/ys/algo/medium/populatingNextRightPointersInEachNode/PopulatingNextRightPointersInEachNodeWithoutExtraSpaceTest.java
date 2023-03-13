package kz.home.ys.algo.medium.populatingNextRightPointersInEachNode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class PopulatingNextRightPointersInEachNodeWithoutExtraSpaceTest {

    @Test
    public void testConnect() {
        Node connectedNodes = new PopulatingNextRightPointersInEachNodeWithoutExtraSpace().connect(
                new Node(
                        1,
                        new Node(2, new Node(4), new Node(5), null),
                        new Node(3, new Node(6), new Node(7), null),
                        null
                )
        );

        assertNull(connectedNodes.next);
        assertEquals(connectedNodes.left.next, connectedNodes.right);
        assertNull(connectedNodes.right.next);
        assertEquals(connectedNodes.left.left.next, connectedNodes.left.right);
        assertEquals(connectedNodes.left.right.next, connectedNodes.right.left);
        assertEquals(connectedNodes.right.left.next, connectedNodes.right.right);
        assertNull(connectedNodes.right.right.next);
    }
}