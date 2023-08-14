package kz.home.ys.algo.hard.allOne;

import java.util.*;

class AllOne {

    private final Map<String, Integer> wordsToCounts;
    private final Map<Integer, Set<String>> countsToWords;
    private int minCount;
    private int maxCount;

    public AllOne() {
        this.wordsToCounts = new HashMap<>();
        this.countsToWords = new HashMap<>();
        this.minCount = Integer.MAX_VALUE;
        this.maxCount = 0;
    }

    public void inc(String key) {
        if (wordsToCounts.containsKey(key)) {
            int count = wordsToCounts.get(key);
            wordsToCounts.put(key, count + 1);
            countsToWords.computeIfAbsent(count + 1, k -> new HashSet<>()).add(key);

            countsToWords.get(count).remove(key);
            if (countsToWords.get(count).isEmpty()) {
                countsToWords.remove(count);

                if (count == minCount) {
                    minCount  = count + 1;
                }
            }
            maxCount = Math.max(maxCount, count + 1);
        } else {
            wordsToCounts.put(key, 1);
            countsToWords.computeIfAbsent(1, k -> new HashSet<>()).add(key);
            minCount = Math.min(minCount, 1);
            maxCount = Math.max(maxCount, 1);
        }
    }

    public void dec(String key) {
        int count = wordsToCounts.get(key);
        if (count == 1) {
            wordsToCounts.remove(key);
            countsToWords.get(count).remove(key);
            if (countsToWords.get(count).isEmpty()) {
                countsToWords.remove(count);

                if (count == maxCount) {
                    maxCount = count - 1;
                }

                if (count == minCount) {
                    for (int i = 1; i <= maxCount; i++) {
                        if (countsToWords.containsKey(i)) {
                            minCount = i;
                            break;
                        }
                    }
                }
            }
        } else {
            wordsToCounts.put(key, count - 1);
            countsToWords.computeIfAbsent(count - 1, k -> new HashSet<>()).add(key);

            countsToWords.get(count).remove(key);
            if (countsToWords.get(count).isEmpty()) {
                countsToWords.remove(count);

                if (count == maxCount) {
                    maxCount = count - 1;
                }
            }
            minCount = Math.min(minCount, count - 1);
        }
    }

    private void removeFromPrevCount(String key, int prevCount) {
        if (countsToWords.containsKey(prevCount)) {
            if (countsToWords.get(prevCount).contains(key)) {
                countsToWords.get(prevCount).remove(key);
            }
            if (countsToWords.get(prevCount).isEmpty()) {
                countsToWords.remove(prevCount);
            }
        }
    }

    private void addToCurrCount(String key, int currCount) {
        countsToWords.putIfAbsent(currCount, new HashSet<>());
        countsToWords.get(currCount).add(key);
    }

    private void calculateMaxCount(int prevCount, int currCount) {
        if (currCount > this.maxCount) {
            this.maxCount = currCount;
        }
    }

    public String getMaxKey() {
        if (!countsToWords.containsKey(maxCount)) return "";
        return countsToWords.get(maxCount).iterator().next();
    }

    public String getMinKey() {
        if (!countsToWords.containsKey(minCount)) return "";
        return countsToWords.get(minCount).iterator().next();
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */