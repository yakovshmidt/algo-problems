package kz.home.ys.algo.hard.mergeKSortedLists;

class MergeKSortedLists {

    // time - O(N * M) - where N is sum of all elements in all ListNodes, and M is length of lists array
    // time - O(1)
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode curr = head;
        
        while (oneElementOfListsIsNotNull(lists)) {
            int minIdx = -1;
            int minVal = Integer.MAX_VALUE; 
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < minVal) {
                    minIdx = i;
                    minVal = lists[i].val;
                }
            }
            curr.next = new ListNode(minVal);
            lists[minIdx] = lists[minIdx].next;
            curr = curr.next;
        }
        
        return head.next;
    }
    
    private boolean oneElementOfListsIsNotNull(ListNode[] lists) { // time - O(N) = where N is length of lists
        for (ListNode node : lists) {
            if (node != null) return true;
        }
        return false;
    }
}