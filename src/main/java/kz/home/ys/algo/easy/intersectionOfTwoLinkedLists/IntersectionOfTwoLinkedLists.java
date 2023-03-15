package kz.home.ys.algo.easy.intersectionOfTwoLinkedLists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedLists {

    // time - O(N + M)
    // space - O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = 0;
        ListNode currA = headA;
        while (currA != null) {
            aLength++;
            currA = currA.next;
        }

        int bLength = 0;
        ListNode currB = headB;
        while (currB != null) {
            bLength++;
            currB = currB.next;
        }

        currA = headA;
        currB = headB;
        while (currA != null && currB != null && aLength != bLength) {
            if (aLength > bLength) {
                currA = currA.next;
                aLength--; 
            } else {
                currB = currB.next;
                bLength--;
            }
        }

        while (aLength > 0) {
            if (currA == currB) {
                return currA;
            } else {
                currA = currA.next;
                currB = currB.next;
                aLength--;
                bLength--;
            }
        }

        return null;
    }
}