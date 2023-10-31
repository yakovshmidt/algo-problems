package kz.home.ys.algo.medium.findAndReplaceInString;

import java.util.*;

class FindAndReplaceInString {

    // Time - O(N * M) - where N is S length and M is max length of source word
    // Space - O(L) - where L is number of indices
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        Map<Integer, Integer> replacements = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            if (s.startsWith(sources[i], indices[i])) {
                replacements.put(indices[i], i);
            }
        }

        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < s.length()) {
            if (replacements.containsKey(idx)) {
                sb.append(targets[replacements.get(idx)]);
                idx += sources[replacements.get(idx)].length();
            } else {
                sb.append(s.charAt(idx++));
            }
        }
        return sb.toString();
    }
}