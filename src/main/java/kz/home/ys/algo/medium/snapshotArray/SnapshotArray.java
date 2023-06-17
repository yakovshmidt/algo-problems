package kz.home.ys.algo.medium.snapshotArray;

import java.util.TreeMap;

class SnapshotArray {

    private int snapId = 0;
    private final TreeMap<Integer, Integer>[] map;

    public SnapshotArray(int length) {
        this.map = new TreeMap[length];
        for (int i = 0; i < length; i++) {
            this.map[i] = new TreeMap<>();
            this.map[i].put(0, 0);
        }
    }
    
    public void set(int index, int val) {
        this.map[index].put(snapId, val);
    }
    
    public int snap() {
        return snapId++;
    }
    
    public int get(int index, int snap_id) {
        return this.map[index].floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */