package kz.home.ys.algo.easy.designHashSet;

import java.util.LinkedList;

class MyHashSet {

    private final Bucket[] buckets;
    private final int keyRange;

    public MyHashSet() {
        this.keyRange = 769;
        this.buckets = new Bucket[this.keyRange];
    }
    
    public void add(int key) {
        int bucketIdx = key % keyRange;
        Bucket bucket = buckets[bucketIdx];
        if (bucket == null) bucket = buckets[bucketIdx] = new Bucket();
        if (!bucket.exists(key)) {
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int bucketIdx = key % keyRange;
        Bucket bucket = buckets[bucketIdx];
        if (bucket != null && bucket.exists(key)) {
            bucket.remove(key);
        }
    }
    
    public boolean contains(int key) {
        int bucketIdx = key % keyRange;
        Bucket bucket = buckets[bucketIdx];
        return bucket != null && bucket.exists(key);
    }

    private static class Bucket {
        private LinkedList<Integer> container;

        public Bucket() {
            container = new LinkedList<>();
        }

        public boolean exists(int key) {
            for (int i = 0; i < container.size(); i++) {
                if (container.get(i) == key) return true;
            }
            return false;
        }

        public void add(int key) {
            container.add(key);
        }

        public void remove(int key) {
            container.remove((Integer) key);
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */