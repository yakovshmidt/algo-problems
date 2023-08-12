package kz.home.ys.algo.medium.customSortString;

import java.util.Arrays;
import java.util.Comparator;

class CustomSortStringLeetCode {

    // time - O(ORDER_LENGTH + S_LENGTH)
    // space - O(S_LENGTH)
    public String customSortString(String order, String s) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            char letter = order.charAt(i);
            int numberOfLetters = alphabet[letter - 'a'];

            sb.append(String.valueOf(letter).repeat(Math.max(0, numberOfLetters)));

            alphabet[letter - 'a'] = 0;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) sb.append((char) ('a' + i));
        }

        return sb.toString();
    }
}