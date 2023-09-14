package kz.home.ys.algo.medium.wordPatternII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class WordPatternII {

    private final Map<Character, String> patternsToSubstrings = new HashMap<>();
    private final Set<String> visited = new HashSet<>();

    public boolean wordPatternMatch(String pattern, String s) {
        return isMatch(s, 0, pattern, 0);
    }

    private boolean isMatch(String s, int sIdx, String p, int pIdx) {
        if (sIdx == s.length() && pIdx == p.length()) return true;
        if (sIdx == s.length() || pIdx == p.length()) return false;

        char currP = p.charAt(pIdx);

        if (patternsToSubstrings.containsKey(currP)) {
            String substring = patternsToSubstrings.get(currP);

            if (!s.startsWith(substring, sIdx)) {
                return false;
            }

            return isMatch(s, sIdx + substring.length(), p, pIdx + 1);
        }

        for (int i = sIdx; i < s.length(); i++) {
            String substring = s.substring(sIdx, i + 1);

            if (visited.contains(substring)) {
                continue;
            }

            patternsToSubstrings.put(currP, substring);
            visited.add(substring);

            if (isMatch(s, i + 1, p, pIdx + 1)) {
                return true;
            }

            patternsToSubstrings.remove(currP);
            visited.remove(substring);
        }

        return false;
    }
}