package kz.home.ys.algo.google.googleInterviewLeetCodePremium.linkedList.copyListWithRandomPointer;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}