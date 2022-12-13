package kz.home.ys.algo.google.medium.lruCache;

import java.util.HashMap;
import java.util.Map;

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
class LRUCache {

    private final Map<Integer, Node> cache = new HashMap<>();
    private final Node head;
    private final Node tail;
    private int size;
    private final int capacity;

    public LRUCache(int capacity) {
        head = new Node();
        tail = head;

        size = 0;
        this.capacity = capacity;

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;

        Node node = cache.get(key);
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if (node == null) {
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;

            addNode(newNode);
            cache.put(key, newNode);
            size++;

            if (size > capacity) {
                Node tail = popTail();
                cache.remove(tail.key);
                size--;
            }
        } else {
            node.val = value;
            moveToHead(node);
        }
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }

    private Node popTail() {
        Node node = tail.prev;
        removeNode(node);
        return node;
    }

    private void removeNode(Node node) {
        Node next = node.next;
        Node prev = node.prev;

        prev.next = next;
        next.prev = prev;
    }

    private void addNode(Node node) {
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    static class Node {
        public int key = -1;
        public int val = -1;
        public Node next = null;
        public Node prev = null;

        public Node() {

        }

        public Node(int key, int val, Node next, Node prev) {
            this.key = key;
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}