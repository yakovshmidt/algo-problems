package kz.home.ys.algo.easy.isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> associationS = new HashMap<>();
        Map<Character, Character> associationT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (!associationS.containsKey(charS) && !associationT.containsKey(charT)) {
                associationS.put(charS, charT);
                associationT.put(charT, charS);
            } else {
                if (associationS.get(charS) != charT || associationT.get(charT) != charS) {
                    return false;
                }
            }
        }
        return true;
    }
}