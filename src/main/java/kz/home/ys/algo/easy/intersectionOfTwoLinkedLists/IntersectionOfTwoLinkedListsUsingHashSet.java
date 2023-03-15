package kz.home.ys.algo.easy.intersectionOfTwoLinkedLists;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedListsUsingHashSet {

    // time - O(N + M)
    // space - O(N)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        ListNode currA = headA;
        while (currA != null) {
            visited.add(currA);
            currA = currA.next;
        }

        ListNode currB = headB;
        while (currB != null) {
            if (visited.contains(currB)) {
                return currB;
            }
            currB = currB.next;
        }

        return null;
    }
}