package kz.home.ys.algo.medium.bullsAndCows;

import java.util.HashMap;
import java.util.Map;

class BullsAndCows {

    // time - O(N)
    // space - O(N) - but there could be only 10 elements so that space complexity is O(1) in case of changing Map to Array
    public String getHint(String secret, String guess) {
        Map<Character, Integer> h = new HashMap<>();
        int n = secret.length();
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < n; i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                if (h.getOrDefault(s, 0) < 0) cows++;
                if (h.getOrDefault(g, 0) > 0) cows++;
                h.put(s, h.getOrDefault(s, 0) + 1);
                h.put(g, h.getOrDefault(g, 0) - 1);
            }
        }

        return bulls + "A" + cows + "B";
    }
}