package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.minimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

class MinimumWindowSubstring {
    
    //"ADOBECODEBANC", t = "ABC"
    public String minWindow(String s, String t) {
        Map<Character, Integer> dictT = new HashMap<>();
        for (char ch : t.toCharArray()) {
            dictT.put(ch, dictT.getOrDefault(ch, 0) + 1);
        }

        int required = dictT.size();
        int l = 0, r = 0;
        int formed = 0;
        Map<Character, Integer> windowCount = new HashMap<>();
        int[] ans = new int[] {-1, 0, 0};

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

            if (dictT.containsKey(c) && windowCount.get(c).equals(dictT.get(c))) {
                formed++;
            }

            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (ans[0] == -1 || ans[0] > (r + 1 - l)) {
                    ans[0] = r + 1 - l;
                    ans[1] = l;
                    ans[2] = r;
                }

                windowCount.put(c, windowCount.get(c) - 1);
                if (dictT.containsKey(c) && dictT.get(c) > windowCount.get(c)) {
                    formed--;
                }

                l++;
            }
            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}