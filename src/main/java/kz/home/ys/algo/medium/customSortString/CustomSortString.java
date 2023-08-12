package kz.home.ys.algo.medium.customSortString;

import java.util.Arrays;
import java.util.Comparator;

class CustomSortString {
    public String customSortString(String order, String s) {
        int[] orderArr = new int[26];
        int currOrder = 1;
        for (int i = 0; i < order.length(); i++) {
            char letter = order.charAt(i);
            orderArr[letter - 97] = currOrder;
            currOrder++;
        }

        Character[] sArr = new Character[s.length()];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = s.charAt(i);
        }

        Arrays.sort(sArr, Comparator.comparingInt(a -> orderArr[a - 97]));

        StringBuilder sb = new StringBuilder();
        for (char letter : sArr) {
            sb.append(letter);
        }

        return sb.toString();
    }
}