package kz.home.ys.algo.medium.lfuCache;

import kz.home.ys.algo.medium.maximumWidthOfBinaryTree.Pair;

import java.util.*;

class LFUCache {

    private final Map<Integer, Pair<Integer, Integer>> cache;
    private final Map<Integer, LinkedHashSet<Integer>> frequencies;
    private int minFrequency;
    private final int capacity;

    public LFUCache(int capacity) {
        this.cache = new HashMap<>();
        this.frequencies = new HashMap<>();
        this.minFrequency = 0;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        Pair<Integer, Integer> frequencyToValue = cache.get(key);
        int frequency = frequencyToValue.getKey();
        LinkedHashSet<Integer> keys = frequencies.get(frequency);
        keys.remove(key);
        if (keys.isEmpty()) {
            frequencies.remove(frequency);

            if (minFrequency == frequency) minFrequency++;
        }

        int value = frequencyToValue.getValue();

        insert(key, frequency + 1, value);

        return value;
    }

    public void put(int key, int value) {
        if (capacity <= 0) return;

        Pair<Integer, Integer> frequencyToValue = cache.get(key);
        if (frequencyToValue != null) {
            cache.put(key, new Pair<>(frequencyToValue.getKey(), value));
            get(key);
            return;
        }
        if (capacity == cache.size()) {
            LinkedHashSet<Integer> keys = frequencies.get(minFrequency);
            int keyToDelete = keys.iterator().next();
            cache.remove(keyToDelete);
            keys.remove(keyToDelete);
            if (keys.isEmpty()) {
                frequencies.remove(minFrequency);
            }
        }
        minFrequency = 1;
        insert(key, 1, value);
    }

    private void insert(int key, int frequency, int value) {
        cache.put(key, new Pair<>(frequency, value));
        frequencies.putIfAbsent(frequency, new LinkedHashSet<>());
        frequencies.get(frequency).add(key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */