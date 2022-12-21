package kz.home.ys.algo.google.googleInterviewLeetCodePremium.linkedList.copyListWithRandomPointer;

class CopyListWithRandomPointerWithoutExtraSpace {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = next;

            curr = curr.next.next;
        }

        curr = head;
        while (curr != null) {
            Node copyRandom = curr.random != null ? curr.random.next : null;
            Node copy = curr.next;
            copy.random = copyRandom;
            curr = curr.next.next;
        }

        Node currOldNode = head;
        Node currNewNode = head.next;
        Node headOld = head.next;
        while (currOldNode != null) {
            currOldNode.next = currOldNode.next.next;
            currNewNode.next = (currNewNode.next != null) ? currNewNode.next.next : null;
            currOldNode = currOldNode.next;
            currNewNode = currNewNode.next;
        }

        return headOld;
    }
}