package kz.home.ys.algo.hard.countKSubsequencesOfAStringWithMaximumBeauty;

import java.util.HashMap;
import java.util.Map;

public class CountKSubsequencesOfAStringWithMaximumBeauty {
    private Map<Character, Integer> letterToCounts;
    private Map<Integer, Integer> beautyToCounts = new HashMap<>();

    public int countKSubsequencesWithMaxBeauty(String s, int k) {
        letterToCounts = new HashMap<>();
        for (char letter : s.toCharArray()) {
            letterToCounts.put(letter, letterToCounts.getOrDefault(letter, 0) + 1);
        }
        StringBuilder uniqueSB = new StringBuilder();
        for (var letter : letterToCounts.keySet()) {
            uniqueSB.append(letter);
        }

        rec(uniqueSB, 0, k, "");

        int maxBeauty = 0;
        int maxCount = 0;
        for (var entry : beautyToCounts.entrySet()) {
            if (entry.getKey() > maxBeauty) {
                maxBeauty = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxCount;
    }

    private void rec(StringBuilder uniqueSB, int idx, int k, String substring) {
        int currBeauty = 0;
        for (char letter : substring.toCharArray()) {
            currBeauty += letterToCounts.get(letter);
        }
        beautyToCounts.put(currBeauty, beautyToCounts.getOrDefault(currBeauty, 0) + 1);

        if (idx == uniqueSB.length()) return;

        rec(uniqueSB, idx + 1, k, substring + uniqueSB.charAt(idx));
        rec(uniqueSB, idx + 1, k, substring);
    }
}
