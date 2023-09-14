package kz.home.ys.algo.medium.mapSumPairs;

import java.util.HashMap;
import java.util.Map;

class MapSumPairs {

    static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public int count = 0;
    }

    public TrieNode node;

    public MapSumPairs() {
        node = new TrieNode();
    }
    
    public void insert(String key, int val) {
        TrieNode curr = node;
        for (char letter : key.toCharArray()) {
            if (!curr.children.containsKey(letter)) {
                curr.children.put(letter, new TrieNode());
            }
            curr = curr.children.get(letter);
        }
        curr.count = val;
    }
    
    public int sum(String prefix) {
        TrieNode curr = node;
        for (char letter : prefix.toCharArray()) {
            if (curr.children.containsKey(letter)) {
                curr = curr.children.get(letter);
            } else {
                return 0;
            }
        }

        return getCount(curr);
    }

    private int getCount(TrieNode curr) {
        int count = curr.count;
        for (TrieNode child : curr.children.values()) {
            count += getCount(child);
        }
        return count;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */