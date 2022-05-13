package kz.home.ys.algo.medium.findAllAnagramsInString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FindAllAnagramsInString {

    // time - O(N) - where N is length of s
    // space - O(M) - where M is length of p
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) return new ArrayList<>();
        
        Map<Character, Integer> pCount = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char letter = p.charAt(i);
            pCount.put(letter, pCount.getOrDefault(letter, 0) + 1);
        }
        
        List<Integer> anagramIndices = new ArrayList<>();
        
        Map<Character, Integer> sCount = new HashMap<>();
        for (int k = 0; k < p.length(); k++) {
            char letter = s.charAt(k);
            sCount.put(letter, sCount.getOrDefault(letter, 0) + 1);
        }
        
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (i > 0) {
                char letterToDelete = s.charAt(i - 1);
                sCount.put(letterToDelete, sCount.get(letterToDelete) - 1);
                if (sCount.get(letterToDelete) == 0) {
                    sCount.remove(letterToDelete);
                }
                
                char letterToAdd = s.charAt(i + p.length() - 1);
                sCount.put(letterToAdd, sCount.getOrDefault(letterToAdd, 0) + 1);
            }
            
            boolean isAnagram = isAnagram(sCount, pCount);
            if (isAnagram) {
                anagramIndices.add(i);
            }
        }
        
        return anagramIndices;
    }
    
    private boolean isAnagram(Map<Character, Integer> sCount, Map<Character, Integer> pCount) {
        for (Map.Entry<Character, Integer> entry : pCount.entrySet()) {
            Character pLetter = entry.getKey();
            Integer count = entry.getValue();
            
            if (sCount.containsKey(pLetter)) {
                if (count > sCount.get(pLetter)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}