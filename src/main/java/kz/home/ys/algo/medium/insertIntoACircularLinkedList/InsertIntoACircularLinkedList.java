package kz.home.ys.algo.medium.insertIntoACircularLinkedList;

class InsertIntoACircularLinkedList {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node newNode = new Node(insertVal);
            newNode.next = newNode;
            return newNode;
        }

        Node curr = head;
        Node next = head.next;
        boolean toInsert = false;
        do {
            if (curr.val <= insertVal && insertVal <= next.val) {
                toInsert = true;
            } else if (curr.val > next.val) {
                if (insertVal >= curr.val || insertVal <= next.val) {
                    toInsert = true;
                }
            }

            if (toInsert) {
                curr.next = new Node(insertVal, next);
                return head;
            }

            curr = curr.next;
            next = next.next;
        } while (curr != head);

        curr.next = new Node(insertVal, next);
        return head;
    }
}