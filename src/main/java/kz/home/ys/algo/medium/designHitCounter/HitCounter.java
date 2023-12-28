package kz.home.ys.algo.medium.designHitCounter;

import java.util.Map;
import java.util.TreeMap;

class HitCounter {

    private final TreeMap<Integer, Integer> treeMap;

    public HitCounter() {
        this.treeMap = new TreeMap<>();
    }
    
    public void hit(int timestamp) {
        if (treeMap.containsKey(timestamp)) {
            treeMap.put(timestamp, treeMap.get(timestamp) + 1);
        } else {
            if (treeMap.isEmpty()) {
                treeMap.put(timestamp, 1);
            } else {
                Map.Entry<Integer, Integer> lastEntry = treeMap.lastEntry();
                treeMap.put(timestamp, lastEntry.getValue() + 1);
            }
        }
    }
    
    public int getHits(int timestamp) {
        var leftEntry = treeMap.floorEntry(timestamp - 300);
        var rightEntry = treeMap.floorEntry(timestamp);
        int right = rightEntry == null ? 0 : rightEntry.getValue();
        int left = leftEntry == null ? 0 : leftEntry.getValue();
        return right - left;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */