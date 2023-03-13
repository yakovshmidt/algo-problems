package kz.home.ys.algo.medium.populatingNextRightPointersInEachNode;

class PopulatingNextRightPointersInEachNodeWithoutExtraSpace {

    // time - O(N)
    // space - O(1)
    public Node connect(Node root) {
       if (root == null) return null;

       Node leftmost = root;

       while (leftmost.left != null) {
           Node head = leftmost;

           while (head != null) {
               head.left.next = head.right;

               if (head.next != null) {
                   head.right.next = head.next.left;
               } 

               head = head.next;
           }

           leftmost = leftmost.left;
       }

       return root;
    }
}