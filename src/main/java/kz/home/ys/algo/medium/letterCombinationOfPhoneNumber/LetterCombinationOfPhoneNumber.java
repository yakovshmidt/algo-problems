package kz.home.ys.algo.medium.letterCombinationOfPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LetterCombinationOfPhoneNumber {

    private static final Map<Character, List<String>> digitsToLetters;

    static {
        digitsToLetters = new HashMap<>();
        digitsToLetters.put('2', List.of("a", "b", "c"));
        digitsToLetters.put('3', List.of("d", "e", "f"));
        digitsToLetters.put('4', List.of("g", "h", "i"));
        digitsToLetters.put('5', List.of("j", "k", "l"));
        digitsToLetters.put('6', List.of("m", "n", "o"));
        digitsToLetters.put('7', List.of("p", "q", "r", "s"));
        digitsToLetters.put('8', List.of("t", "u", "v"));
        digitsToLetters.put('9', List.of("w", "x", "y", "z"));
    }

    // time - O(3^N + 4^M) - where N is the number of digits that map to 3 letters
    // and M is the number of digits that map to 4 letters, and N+M is the total number of digits
    // space - O(3^N + 4^M)
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        return letterSubCombinations(digits, 0);
    }

    private List<String> letterSubCombinations(String digits, int currIdx) {
        char digit = digits.charAt(currIdx);
        List<String> allLetterSubCombinations = new ArrayList<>();
        if (digitsToLetters.containsKey(digit)) {
            List<String> letters = digitsToLetters.get(digit);
            boolean isLastIdx = currIdx == digits.length() - 1;
            if (isLastIdx) return letters;
            for (String letter : letters) {
                List<String> currLetterSubCombinations = new ArrayList<>(letterSubCombinations(digits, currIdx + 1));
                for (int i = 0; i < currLetterSubCombinations.size(); i++) {
                    currLetterSubCombinations.set(i, letter + currLetterSubCombinations.get(i));
                }
                allLetterSubCombinations.addAll(currLetterSubCombinations);
            }
        }
        return allLetterSubCombinations;
    }
}