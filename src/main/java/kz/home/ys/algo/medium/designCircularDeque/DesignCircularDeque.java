package kz.home.ys.algo.medium.designCircularDeque;

import java.util.LinkedList;

class DesignCircularDeque {

    private final LinkedList<Integer> list;
    private final int maxSize;

    public DesignCircularDeque(int k) {
        this.list = new LinkedList<>();
        this.maxSize = k;
    }
    
    public boolean insertFront(int value) {
        if (list.size() < maxSize) {
            list.addFirst(value);
            return true;
        } 
        return false;
    }
    
    public boolean insertLast(int value) {
        if (list.size() < maxSize) {
            list.addLast(value);
            return true;
        } 
        return false;
    }
    
    public boolean deleteFront() {
        if (list.isEmpty()) return false;
        list.removeFirst();
        return true;
    }
    
    public boolean deleteLast() {
        if (list.isEmpty()) return false;
        list.removeLast();
        return true;
    }
    
    public int getFront() {
        if (list.isEmpty()) return -1;
        return list.getFirst();
    }
    
    public int getRear() {
        if (list.isEmpty()) return -1;
        return list.getLast();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public boolean isFull() {
        return list.size() == maxSize;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */