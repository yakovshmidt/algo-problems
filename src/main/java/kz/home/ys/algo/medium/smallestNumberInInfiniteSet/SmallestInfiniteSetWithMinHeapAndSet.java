package kz.home.ys.algo.medium.smallestNumberInInfiniteSet;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class SmallestInfiniteSetWithMinHeapAndSet {

    /*

    time - O(log(N))
    space - O(N)

    */

    private final Set<Integer> isVisited;
    private final PriorityQueue<Integer> addedIntegers;
    private int currInteger;

    public SmallestInfiniteSetWithMinHeapAndSet() {
        isVisited = new HashSet<>();
        addedIntegers = new PriorityQueue<>();
        currInteger = 1;
    }

    public int popSmallest() {
        int answer;
        if (addedIntegers.isEmpty()) {
            answer = currInteger;
            currInteger++;
        } else {
            answer = addedIntegers.poll();
            isVisited.remove(answer);
        }
        return answer;
    }

    public void addBack(int num) {
        if (currInteger <= num || addedIntegers.contains(num)) return;
        addedIntegers.add(num);
        isVisited.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */