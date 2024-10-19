package kz.home.ys.algo.medium.topKFrequentWords;

import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        /*
        
        Approach:
        1. Map<Word, Freq>
        2. Map<Freq, List<Word>>
        3. take k elements
        
        */

        int maxFreq = Integer.MIN_VALUE; 
        Map<String, Integer> wordsToFreqs = new HashMap<>();
        for (String word : words) {
            wordsToFreqs.put(word, wordsToFreqs.getOrDefault(word, 0) + 1);
            maxFreq = Math.max(maxFreq, wordsToFreqs.get(word));
        }


        List<String>[] freqsToWords = new List[maxFreq + 1];
        for (int i = 0; i < freqsToWords.length; i++) {
            freqsToWords[i] = new ArrayList<>();
        }

        for (var entry : wordsToFreqs.entrySet()) {
            String word = entry.getKey();
            int freq = entry.getValue();

            freqsToWords[freq].add(word);
        }

        List<String> result = new ArrayList<>();
        for (int freq = maxFreq - 1; freq >= 0; freq--) {
            List<String> w = freqsToWords[freq];
            Collections.sort(w);
            
            if (k == 0) break;

            for (String word : w) {
                if (k == 0) break;
                result.add(word);
                k--;
            }
        }
        return result;
    }
}