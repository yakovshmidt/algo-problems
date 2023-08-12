package kz.home.ys.algo.medium.designAStackWithIncrementOperation;

import java.util.LinkedList;

class DesignAStackWithIncrementOperation {

    private final LinkedList<Integer> list;
    private final int maxSize;

    public DesignAStackWithIncrementOperation(int maxSize) {
        this.list = new LinkedList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if (list.size() < maxSize) {
            list.addLast(x);
        }
    }
    
    public int pop() {
        return list.isEmpty() ? -1 : list.removeLast();
    }
    
    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, list.size()); i++) {
            list.set(i, list.get(i) + val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */