package kz.home.ys.algo.google.googleInterviewLeetCodePremium.linkedList.addTwoNumbers;

public class AddTwoNumbers {

    // time - O(Max(N, M))
    // space - O(Max(N, M) + 1)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*

        1) iterate over all elements
        2) get first node from l1 and l2, add them, save carry if needed

        time - O(N) - where N is longest linked list
        space - O(N + 1) - where N is the longest linked list

        */

        ListNode result = new ListNode(-1);
        ListNode curr = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int first = l1 == null ? 0 : l1.val;
            int second = l2 == null ? 0 : l2.val;

            int sum = first + second + carry;
            System.out.println(sum);
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry != 0) {
            curr.next = new ListNode(carry);
        }

        return result.next;
    }
}