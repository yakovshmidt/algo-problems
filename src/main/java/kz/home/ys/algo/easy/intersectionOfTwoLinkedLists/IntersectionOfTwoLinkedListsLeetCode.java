package kz.home.ys.algo.easy.intersectionOfTwoLinkedLists;

public class IntersectionOfTwoLinkedListsLeetCode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        while (currA != currB) {
            currA = (currA == null) ? headB : currA.next;
            currB = (currB == null) ? headA : currB.next;
        }
        return currA;
    }
}