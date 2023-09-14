package kz.home.ys.algo.medium.checkIfStringsCanBeMadeEqualWithOperationsII;

import com.sun.source.tree.Tree;

import java.util.*;

public class CheckIfStringsCanBeMadeEqualWithOperationsII {

    public boolean checkStrings(String s1, String s2) {
        char[] s1Arr = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            s1Arr[i] = s1.charAt(i);
        }
        char[] s2Arr = new char[s2.length()];
        for (int i = 0; i < s2.length(); i++) {
            s2Arr[i] = s2.charAt(i);
        }
        Map<Character, List<Integer>> s1LettersToIndices = new HashMap<>();
        for (int i = 0; i < s1Arr.length; i++) {
            s1LettersToIndices.putIfAbsent(s1Arr[i], new ArrayList<>());
            s1LettersToIndices.get(s1Arr[i]).add(i);
        }

        for (int i = 0; i < s1.length(); i++) {
            char s1Letter = s1Arr[i];
            char s2Letter = s2Arr[i];
            if (s1Letter != s2Letter) {
                List<Integer> indices = s1LettersToIndices.get(s2Letter);
                if (indices == null || indices.isEmpty()) return false;

                for (int l = indices.size() - 1; l >= 0; l--) {
                    Integer k = indices.get(l);
                    if ((k - i) % 2 == 0 && s1Arr[k] == s2Letter) {
                        s1LettersToIndices.get(s1Letter).remove((Integer) i);
                        s1LettersToIndices.get(s1Letter).add(k);
                        swap(s1Arr, i, k);
                        indices.remove(k);
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1Arr[i] != s2Arr[i]) return false;
        }
        return true;
    }

    private void swap(char[] s1Arr, int i, int j) {
        char temp = s1Arr[i];
        s1Arr[i] = s1Arr[j];
        s1Arr[j] = temp;
   }
}
