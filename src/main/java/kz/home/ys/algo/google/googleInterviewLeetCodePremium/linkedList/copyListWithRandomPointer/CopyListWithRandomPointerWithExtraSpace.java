package kz.home.ys.algo.google.googleInterviewLeetCodePremium.linkedList.copyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

class CopyListWithRandomPointerWithExtraSpace {

    // time - O(N)
    // space - O(N)
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldToNew = new HashMap<>();
        Node copy = new Node(-1);
        Node currCopy = copy;
        Node curr = head;
        while (curr != null) {
            currCopy.next = new Node(curr.val);
            currCopy = currCopy.next;
            oldToNew.put(curr, currCopy);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            Node currRandom = curr.random;
            if (currRandom != null) {
                oldToNew.get(curr).random = oldToNew.get(currRandom);
            }
            curr = curr.next;
        }

        return copy.next;
    }
}