package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.minimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

class MinimumWindowSubstring {
    
    //"ADOBECODEBANC", t = "ABC"
    public String minWindow(String s, String t) {
        int remainingCount = t.length();  // 1
        Map<Character, Integer> lettersToCounts = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            lettersToCounts.put(t.charAt(i), lettersToCounts.getOrDefault(t.charAt(i), 0) + 1);
        }

        /*
        
        A - 0
        B - 0
        C - 1
        
        */
        int l = 0;// 0
        int r = 0;// 5
        String minWindow = "";
        while (r < s.length()) { // 0 < 13
            char letterR = s.charAt(r); // A
            if (lettersToCounts.containsKey(letterR)) {
                char letterL = s.charAt(l); // A
                int countR = lettersToCounts.put(letterR, lettersToCounts.get(letterR) - 1);
                while (countR < 0 && l < r) {
                    if (lettersToCounts.containsKey(letterL)) {
                        lettersToCounts.put(letterL, lettersToCounts.get(letterL) + 1);
                    }
                    l++;
                }
                remainingCount--;
                
                if (remainingCount == 0) {
                    while (l < r && !lettersToCounts.containsKey(letterL)) {
                        l++;
                    }
                    
                    if (minWindow.isEmpty() || minWindow.length() > r - l + 1) {
                        minWindow = s.substring(l, r + 1);
                    }
                    
                    lettersToCounts.put(letterL, lettersToCounts.get(letterL) + 1);
                    remainingCount++;
                    l++;
                }
            }
            r++;
        }
        
        return minWindow;
    }
}