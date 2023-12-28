package kz.home.ys.algo.hard.stickersToSpellWord;

import java.util.HashMap;
import java.util.Map;

class StickersToSpellWord {

    public int minStickers(String[] stickers, String target) {
        Map<String, Map<Character, Integer>> stickersCount = new HashMap<>();
        for (String sticker : stickers) {
            Map<Character, Integer> lettersToCounts = new HashMap<>();
            for (char letter : sticker.toCharArray()) {
                lettersToCounts.put(letter, lettersToCounts.getOrDefault(letter, 0) + 1);
            }
            stickersCount.put(sticker, lettersToCounts);
        }
        System.out.println(stickersCount);

        int result = recursion(target, new HashMap<>(), stickersCount);
        return result < 1 || result == Integer.MAX_VALUE ? -1 : result;
    }

    private int recursion(String target, Map<String, Integer> dp, Map<String, Map<Character, Integer>> stickersCount) {
        if (target.isEmpty()) return 0;
        if (dp.containsKey(target)) return dp.get(target);

        int result = Integer.MAX_VALUE;
        for (var value : stickersCount.values()) {
            Map<Character, Integer> lettersToCounts = new HashMap<>(value);
            String temp = target;

            char letter = temp.charAt(0);
            if (lettersToCounts.containsKey(letter)) {
                for (int i = 0; i < temp.length(); i++) {
                    letter = temp.charAt(i);
                    if (lettersToCounts.containsKey(letter) && lettersToCounts.get(letter) > 0) {
                        lettersToCounts.put(letter, lettersToCounts.get(letter) - 1);
                        temp = temp.substring(0, i) + temp.substring(i + 1);
                        i--;
                    }
                }
                if (temp.length() != target.length()) {
                    result = Math.min(result, 1 + recursion(temp, dp, stickersCount));
                    dp.put(target, result);
                }
            }
        }
        return result;
    }
}